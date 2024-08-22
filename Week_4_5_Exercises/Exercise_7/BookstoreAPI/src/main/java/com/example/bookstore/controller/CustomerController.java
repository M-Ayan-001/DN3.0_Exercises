package com.example.bookstore.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.dto.CustomerDTO;
import com.example.bookstore.mapper.CustomerMapper;
import com.example.bookstore.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final Map<Long, Customer> customerStore = new HashMap<>();
	private long nextId = 1L;

	@PostMapping
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
		Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
		customer.setId(nextId++);
		customerStore.put(customer.getId(), customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(CustomerMapper.INSTANCE.customerToCustomerDTO(customer));
	}

	@PostMapping("/register")
	public ResponseEntity<Customer> registerCustomer(@ModelAttribute Customer customer) {
		customer.setId(nextId++);
		customerStore.put(customer.getId(), customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer);
	}
}
