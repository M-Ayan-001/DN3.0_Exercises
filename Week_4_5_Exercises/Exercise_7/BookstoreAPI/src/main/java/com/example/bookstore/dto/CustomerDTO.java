package com.example.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDTO {
	private Long id;

	@JsonProperty("customer_name")
	private String name;

	@JsonProperty("customer_email")
	private String email;

	private String address;

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
