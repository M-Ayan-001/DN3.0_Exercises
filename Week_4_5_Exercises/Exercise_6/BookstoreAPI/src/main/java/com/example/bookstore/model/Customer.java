package com.example.bookstore.model;

import lombok.Data;

@Data
public class Customer {
	private Long id;
	private String name;
	private String email;
	private String address;

	public void setId(long l) {
		this.id = l;
	}

	public Long getId() {
		return this.id;
	}
}
