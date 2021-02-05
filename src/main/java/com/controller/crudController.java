package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Book;
import com.model.EmployeeEntity;
import com.model.flatData;
import com.repository.BooksRepository;
import com.service.BooksService;

@RequestMapping("V1")

@RestController  
public class crudController {
	
	@Autowired
	BooksService booksService;
	
	@GetMapping("/book")
	
	private List<Book> getAllBooks()   { 
		System.out.println( booksService.getAllBooks()+"bhaillog");
	    return booksService.getAllBooks(); 
	
	}  
	
	@GetMapping("/book/{bookid}")  
	private Book getBooks(@PathVariable("bookid") int bookid)   
	{  
	return booksService.getBooksById(bookid);  
	}  
	
	@PostMapping("/books")  
	private int saveBook(@RequestBody Book books)   
	{  
	booksService.saveOrUpdate(books);  
	return books.getId();  
	}  
	
	@DeleteMapping("/book/{bookid}")  
	private void deleteBook(@PathVariable("bookid") int bookid){  
	booksService.delete(bookid);  
	}  
	
@GetMapping("/getFlatData")
	
	private List<flatData> getData()   { 
		System.out.println( booksService.getData());
	    return booksService.getData(); 
	
	} 
	 

}
