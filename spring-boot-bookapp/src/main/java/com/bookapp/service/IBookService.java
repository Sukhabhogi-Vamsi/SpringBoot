package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> getAll();
    List<Book> getByAuthor(String author) throws BookNotFoundException;
    List<Book> getByCategory(String category) throws BookNotFoundException;
    List<Book> getByLesserPrice(String author, double price) throws BookNotFoundException;
    List<Book> getByTitleStarting(String choice) throws BookNotFoundException;
    Book getById(int bookId) throws BookNotFoundException;
}
