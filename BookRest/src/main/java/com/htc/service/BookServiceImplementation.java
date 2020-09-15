package com.htc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.htc.beans.Book;
import com.htc.dao.BookDAO;

@Service
public class BookServiceImplementation implements BookService
{
	
	@Autowired
	BookDAO bookDAO;

	@Override
	public boolean addBookService(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.addBookDAO(book);
	}

	@Override
	public Book getBookByIdService(String bookId) {
		// TODO Auto-generated method stub
		return bookDAO.getBookByIdDAO(bookId);
	}

	@Override
	public List<Book> getAllBooksService() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooksDAO();
	}

	@Override
	public boolean updateBookService(String bookId, Book book) {
		// TODO Auto-generated method stub
		return bookDAO.updateBookDAO(bookId, book);
	}

	@Override
	public boolean removeBookService(String bookId) {
		// TODO Auto-generated method stub
		return bookDAO.removeBookDAO(bookId);
	}
	
}
