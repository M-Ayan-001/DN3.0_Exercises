package com.example.bookstore.model;

import lombok.Data;

@Data
public class Book {
	private Long id;
	private String title;
	private String author;
	private double price;
	private String isbn;

	public void setId(long l) {
		this.id = l;
	}

	public Long getId() {
		return this.id;
	}
}
