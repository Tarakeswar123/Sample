package com.htc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.htc.beans.Book;

@Repository
public class BookDAOImplementation implements BookDAO
{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean addBookDAO(Book book) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="INSERT INTO book VALUES(?,?,?,?,?,?,?,?)";
		int output=jdbcTemplate.update(sql, book.getBookId(),book.getBookName(),book.getBookAuthor(),book.getBookPrice(),book.getBookQuantity(),book.getIssueDate(),book.getGender(),book.getSubscription());
		if(output>0)
		{
			status=true;
		}
		return status;
	}

	@Override
	public Book getBookByIdDAO(String bookId) {
		// TODO Auto-generated method stub
		String sql="SELECT book_id,book_name,book_author,book_price,book_quantity,book_issue_date,gender,subscription FROM book WHERE book_id=?";
		Book book9=jdbcTemplate.queryForObject(sql, new Object[] {bookId}, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet resultSet, int rowCountNumber) throws SQLException {
				// TODO Auto-generated method stub
				Book book=new Book(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getDate(6), resultSet.getString(7), resultSet.getString(8));
				return book;
			}
			
		});
		return book9;
	}

	@Override
	public List<Book> getAllBooksDAO() {
		// TODO Auto-generated method stub
		String sql="SELECT book_id,book_name,book_author,book_price,book_quantity,book_issue_date,gender,subscription FROM book";
		List<Book> list=jdbcTemplate.query(sql, new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet resultSet, int rowCountNumber) throws SQLException {
				// TODO Auto-generated method stub
				Book book=new Book(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getDate(6), resultSet.getString(7), resultSet.getString(8));
				return book;
			}
			
		});
		return list;
	}

	@Override
	public boolean updateBookDAO(String bookId, Book book) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="UPDATE book SET book_name=?,book_author=?,book_price=?,book_quantity=?,book_issue_date=?,gender=?,subscription=? WHERE book_id=?";
		int output=jdbcTemplate.update(sql, book.getBookName(),book.getBookAuthor(),book.getBookPrice(),book.getBookQuantity(),book.getIssueDate(),book.getGender(),book.getSubscription(),book.getBookId());
		if(output>0)
		{
			status=true;
		}
		return status;
	}

	@Override
	public boolean removeBookDAO(String bookId) {
		// TODO Auto-generated method stub
		boolean status=false;
		String sql="DELETE FROM book WHERE book_id=?";
		int output=jdbcTemplate.update(sql, bookId);
		if(output>0)
		{
			status=true;
		}
		return status;
	}
	
}
