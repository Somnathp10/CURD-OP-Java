package com.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.model.Book;

public interface BooksRepository extends CrudRepository<Book, Integer>{

	Book findById(int id);

	

	
	//Optional<Book> findById(int id);
}
