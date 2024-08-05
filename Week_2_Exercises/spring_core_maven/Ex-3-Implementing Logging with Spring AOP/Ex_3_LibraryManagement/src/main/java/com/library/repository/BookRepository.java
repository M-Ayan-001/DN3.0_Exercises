package com.library.repository;

public class BookRepository {
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BookRepository [bookName=" + bookName + "]";
	}

}
