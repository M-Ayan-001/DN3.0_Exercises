package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	private BookRepository bookRepo;

	public BookRepository getBookRepo() {
		return bookRepo;
	}

	public void setBookRepo(BookRepository bookRepo1) {
		this.bookRepo = bookRepo1;
	}

	public void display() {
		System.out.println(this.bookRepo.toString());
	}

}
