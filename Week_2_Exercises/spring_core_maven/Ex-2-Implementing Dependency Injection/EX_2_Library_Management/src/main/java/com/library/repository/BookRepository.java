package com.library.repository;

public class BookRepository {
	private String bookName;
	private String bookID;
	private String bookPrice;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookRepository [bookName=" + bookName + ", bookID=" + bookID + ", bookPrice=" + bookPrice + "]";
	}

}
