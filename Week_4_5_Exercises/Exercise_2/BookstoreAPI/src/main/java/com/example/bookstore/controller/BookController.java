package com.example.bookstore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	private final Map<Long, Book> bookStore = new HashMap<>();
	private long nextId = 1L;

	@GetMapping
	public List<Book> getAllBooks() {
		return new ArrayList<>(bookStore.values());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) {
		Book book = bookStore.get(id);
		if (book != null) {
			return ResponseEntity.ok(book);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
		newBook.setId(nextId++);
		bookStore.put(newBook.getId(), newBook);
		return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
		if (bookStore.containsKey(id)) {
			updatedBook.setId(id);
			bookStore.put(id, updatedBook);
			return ResponseEntity.ok(updatedBook);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
		if (bookStore.containsKey(id)) {
			bookStore.remove(id);
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
