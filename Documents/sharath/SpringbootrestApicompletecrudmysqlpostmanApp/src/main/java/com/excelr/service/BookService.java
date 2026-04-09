package com.excelr.service;

import java.util.List;

import com.excelr.entity.Book;

public interface BookService  {

	
	public abstract String upsertBook(Book book);
	 List<Book> getAllBooks();
	 String  deleteBook(Integer bookId);
	
}
