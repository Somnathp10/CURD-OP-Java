package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.model.flatData;
import com.repository.BooksRepository;
import com.repository.flatDataRepository;

@Service
public class BooksService {
	@Autowired  
	BooksRepository booksRepository; 
	
	@Autowired
	flatDataRepository flat;
	
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();  
		books = (List<Book>) booksRepository.findAll();  
		return books;  
	}

	public Book getBooksById(int id) {
	    return booksRepository.findById(id);
	}

	public void saveOrUpdate(Book books) {
		books.setEmp(books.getEmp());
		System.out.println(books.getEmp()+"emp=");
		booksRepository.save(books);  
		
	}

	public void delete(int bookid) {
		 booksRepository.delete(bookid);
		
	}
	
	public List<flatData> getData() {
		List<flatData> flatdata = new ArrayList<flatData>();  
		flatdata = (List<flatData>) flat.findAll();  
		return flatdata;  
	}
		
}
