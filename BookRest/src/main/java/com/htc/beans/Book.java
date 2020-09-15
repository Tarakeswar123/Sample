package com.htc.beans;

import java.util.Date;

public class Book 
{
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPrice;
	private String bookQuantity;
	private Date issueDate;
	private String gender;
	private String subscription;
	
	public Book()
	{
		
	}
	
	public Book(String bookId, String bookName, String bookAuthor, String bookPrice, String bookQuantity,
			Date issueDate, String gender, String subscription) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookQuantity = bookQuantity;
		this.issueDate = issueDate;
		this.gender = gender;
		this.subscription = subscription;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(String bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSubscription() {
		return subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookQuantity=" + bookQuantity + ", issueDate=" + issueDate + ", gender=" + gender
				+ ", subscription=" + subscription + "]";
	}
	
}
