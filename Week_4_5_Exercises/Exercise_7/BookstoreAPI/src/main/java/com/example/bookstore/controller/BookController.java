package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.mapper.BookMapper;
import com.example.bookstore.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	private final Map<Long, Book> bookStore = new HashMap<>();
	private long nextId = 1L;

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public static class BookNotFoundException extends RuntimeException {
		public BookNotFoundException(String message) {
			super(message);
		}
	}

	@GetMapping
	public ResponseEntity<List<Book>> getBooks(@RequestParam(required = false) String title,
			@RequestParam(required = false) String author) {

		List<Book> filteredBooks = bookStore.values().stream()
				.filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title))
						&& (author == null || book.getAuthor().equalsIgnoreCase(author)))
				.toList();

		return ResponseEntity.ok(filteredBooks);
	}

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<BookDTO> getBookById(@PathVariable Long id) {
		Book book = bookStore.get(id);
		if (book != null) {
			BookDTO bookDTO = BookMapper.INSTANCE.bookToBookDTO(book);
			return ResponseEntity.ok(bookDTO);
		} else {
			throw new BookNotFoundException("Book with ID " + id + " not found");
		}
	}

	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book newBook) {
		newBook.setId(nextId++);
		bookStore.put(newBook.getId(), newBook);

		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Custom-Header", "BookstoreAPI");

		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(newBook);
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
