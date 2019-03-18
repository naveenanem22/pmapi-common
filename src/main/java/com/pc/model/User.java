package com.pc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("id")
	private int id;

	@JsonProperty("userName")
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
