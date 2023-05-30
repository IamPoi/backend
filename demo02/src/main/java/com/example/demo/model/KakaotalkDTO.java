package com.example.demo.model;

public class KakaotalkDTO {

	private Long id;
	private String email;
	private String nickname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public KakaotalkDTO(Long id, String email, String nickname) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
	}

}
