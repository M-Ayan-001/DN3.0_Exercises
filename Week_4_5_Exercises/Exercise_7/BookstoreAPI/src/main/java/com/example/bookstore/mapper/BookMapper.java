package com.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.model.Book;

@Mapper
public interface BookMapper {
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	BookDTO bookToBookDTO(Book book);

	Book bookDTOToBook(BookDTO bookDTO);
}
