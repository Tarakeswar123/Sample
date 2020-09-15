package com.htc.dao;

import java.util.List;
import com.htc.beans.Book;

public interface BookDAO 
{
	public boolean addBookDAO(Book book);
	public Book getBookByIdDAO(String bookId);
	public List<Book> getAllBooksDAO();
	public boolean updateBookDAO(String bookId,Book book);
	public boolean removeBookDAO(String bookId);
}
