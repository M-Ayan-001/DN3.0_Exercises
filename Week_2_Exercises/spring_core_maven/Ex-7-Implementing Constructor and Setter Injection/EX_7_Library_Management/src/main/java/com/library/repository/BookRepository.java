package com.library.repository;

public class BookRepository {
	private String bookID;
	private String bookName;
	private int bookPrice;

	public BookRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookRepository [bookID=" + bookID + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
}
