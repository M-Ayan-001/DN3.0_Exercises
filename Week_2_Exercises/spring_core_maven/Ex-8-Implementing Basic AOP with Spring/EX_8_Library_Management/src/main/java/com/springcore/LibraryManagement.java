package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagement {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookService BS1 = (BookService) context.getBean("bookService1");
		BookService BS2 = (BookService) context.getBean("bookService2");
		BS1.display();
		BS2.display();
	}

}
