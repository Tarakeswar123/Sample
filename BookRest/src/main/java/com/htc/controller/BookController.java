package com.htc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.htc.beans.Book;
import com.htc.service.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders="*")
public class BookController 
{
	
	@Autowired
	BookService bookService;
	
	@PostMapping(value = "/addBook", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addBook(@RequestBody Book book)
	{
		boolean status=bookService.addBookService(book);
		System.out.println(book);
		HttpHeaders httpHeaders=new HttpHeaders();
		return new ResponseEntity<Boolean>(status,httpHeaders,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> list=bookService.getAllBooksService();
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getBook/{bookId}")
	public ResponseEntity<Book> getProductById(@PathVariable("bookId") String bookId)
	{
		Book book2=bookService.getBookByIdService(bookId);
		System.out.println(book2);
		System.out.println(bookId);
		   return new ResponseEntity<Book>(book2, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/removeBook/{bookId}")
	public boolean removeProductData(@PathVariable("bookId") String bookId)
	{
		boolean status=bookService.removeBookService(bookId);
		System.out.println(status);
		return status;
	}
	
	@PutMapping(value="/updateBook/{bookId}")
	public boolean updateBook(@PathVariable("bookId") String bookId, @RequestBody Book book)
	{
		boolean status=bookService.updateBookService(bookId, book);
		System.out.println(status);
		return status;
	}
	
}
