package br.com.chocode.back.security;

import java.security.Key;
import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import br.com.chocode.back.model.Entregador;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class TokenUtil {

	private static final int    SEGUNDOS = 1000;
	private static final int    MINUTOS  = 60*SEGUNDOS;
	private static final int    HORAS    = 60*MINUTOS;
	private static final int    DIAS     = 24*HORAS;
	
	private static final String HEADER = "Authorization";  //cabecalho http
	private static final String PREFIX = "Bearer ";        //prefixo do token
	private static final long   EXPIRATION = DIAS;         //tempo de validade
	private static final String SECRET_KEY = "3c0MMerc3Do1f00dP@r@T3st3sD3JWT*";  //palavra chave do token
	private static final String EMISSOR    = "Chocode";
	
	public static String createToken(Entregador entregador) {
		Key secretKey = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
		
		String token = Jwts.builder().setSubject(entregador.getEmail())
								     .setIssuer(EMISSOR)
								     .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
								     .signWith(secretKey, SignatureAlgorithm.HS256)
								     .compact();
		System.out.println("TOKEN gerado = "+token);
		return PREFIX + token;
	}
	
	private static boolean isExpirationValid(Date expiration) {
		return expiration.after(new Date(System.currentTimeMillis()));	
	}
	private static boolean isEmissorValid(String emissor) {
		return emissor.equals(EMISSOR);
	}
	private static boolean isSubjectValid(String email) {
		return email!=null && email.length() > 0;
	}
	
	public static Authentication validate(HttpServletRequest request) {
		String token = request.getHeader(HEADER);
		token = token.replace(PREFIX, ""); 
		Jws<Claims> jwsClaims = Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes())
				                                    .build()
				                                    .parseClaimsJws(token);
		
		String email = jwsClaims.getBody().getSubject();
		String issuer   = jwsClaims.getBody().getIssuer();
		Date   expira   = jwsClaims.getBody().getExpiration();
		
		System.out.println(token);
		

		if (isSubjectValid(email) && isEmissorValid(issuer) && isExpirationValid(expira)) {
			return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
		}
	
		return null; 
	}
}
