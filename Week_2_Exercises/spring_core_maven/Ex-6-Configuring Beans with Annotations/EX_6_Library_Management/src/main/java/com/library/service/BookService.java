package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

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
