package com.htc.service;

import java.util.List;
import com.htc.beans.Book;

public interface BookService 
{
	public boolean addBookService(Book book);
	public Book getBookByIdService(String bookId);
	public List<Book> getAllBooksService();
	public boolean updateBookService(String bookId,Book book);
	public boolean removeBookService(String bookId);
}
