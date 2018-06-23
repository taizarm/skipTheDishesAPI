package com.vanhack.api.skipthedishes.domain;

public class User {

	private long id;
	
	private String name;
	
	//TODO Add the user roles (this is the first version).

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
