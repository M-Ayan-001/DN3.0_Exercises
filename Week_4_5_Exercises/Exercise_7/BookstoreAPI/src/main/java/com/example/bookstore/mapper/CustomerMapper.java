package com.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstore.dto.CustomerDTO;
import com.example.bookstore.model.Customer;

@Mapper
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

	CustomerDTO customerToCustomerDTO(Customer customer);

	Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
