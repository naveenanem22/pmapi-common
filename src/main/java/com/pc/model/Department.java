package com.pc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Department {

	@JsonProperty(value = "id")
	private int id;

	@JsonProperty(value = "name")
	private String name;

	public Department() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
