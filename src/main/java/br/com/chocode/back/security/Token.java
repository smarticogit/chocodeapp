package br.com.chocode.back.security;

public class Token {

	private String token;
	private Long id;

	public Token(String token, Long id) {
		super();
		this.token = token;
		this.id = id;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Token() {
		super();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
