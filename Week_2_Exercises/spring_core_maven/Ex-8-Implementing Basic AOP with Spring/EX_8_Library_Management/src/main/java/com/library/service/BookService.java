package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

	private BookRepository bookRepo;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookService(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}

	public BookRepository getBookRepo() {
		return bookRepo;
	}

	public void setBookRepo(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	public void display() {
		System.out.println(this.bookRepo.toString());
	}
}
