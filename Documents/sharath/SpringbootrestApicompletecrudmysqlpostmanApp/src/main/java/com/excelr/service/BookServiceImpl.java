package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.entity.Book;
import com.excelr.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository ;

	@Override
	public String upsertBook(Book book) {

	    if(book.getBookId() != null && bookRepository.existsById(book.getBookId())) {
	        Book updatedBook = bookRepository.save(book);
	        return "Book updated with Id: " + updatedBook.getBookId();
	    } else {
	        Book savedBook = bookRepository.save(book);
	        return "Book inserted with Id: " + savedBook.getBookId();
	    }
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		if(bookRepository.existsById(bookId))
		{
			bookRepository.deleteById(bookId);
			return "Book is deleted with Id : " + bookId;
		}
		return "Book not found with Id :" + bookId;
	}
	
	

}
