package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements IBookService{
    @Autowired
    private BookUtil bookUtil;

    @Override
    public List<Book> getAll() {
        return bookUtil.getAllBooks();
    }

    @Override
    public List<Book> getByAuthor(String author) {
        //get the list of books

        List<Book> books = bookUtil.getAllBooks();
        List<Book> booksByAuthor = new ArrayList<>();
        //iterate through the list
        for (Book book:books){
            //check if the books author matches the author from the parameter
            if (book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }

        }
        if (booksByAuthor.isEmpty()) {
            throw new BookNotFoundException("Book with this author not found ");
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) {
        List<Book> books = bookUtil.getAllBooks();
        List<Book> booksByCategory = new ArrayList<>();
        //iterate through the list
        for (Book book:books){
            //check if the books author matches the author from the parameter
            if (book.getCategory().equals(category)){
                booksByCategory.add(book);
            }

        }
        if (booksByCategory.isEmpty()){
            throw new BookNotFoundException("book with this category not found ");
        }
        return booksByCategory;
    }

    @Override
    public List<Book> getByLesserPrice(String author, double price) {
        List<Book> books = bookUtil.getAllBooks();
        //convert list to stream and filter based on price
//        List<Book> booksByAuthPrice = books.stream()
//                .filter(book -> book.getAuthor().equals(author)&&book.getPrice()<price)
//                .collect(Collectors.toList());
        List<Book> booksByAuthPrice = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getPrice() < price) {
                booksByAuthPrice.add(book);
            }
        }
        if (booksByAuthPrice.isEmpty()){
            throw new BookNotFoundException("Book with this price not found");
        }
        return booksByAuthPrice;
    }

    @Override
    public List<Book> getByTitleStarting(String choice) {
        List<Book> books = bookUtil.getAllBooks();
        //convert list to stream and filter based on title
        List<Book> booksByTitle = books.stream().
                filter(book -> book.getTitle().startsWith(choice))
                .collect(Collectors.toList());
        if (booksByTitle.isEmpty()){
            throw new BookNotFoundException("Book with this starting char not found");
        }
        return booksByTitle;
    }

    @Override
    public Book getById(int bookId) {

//        //get the list of books
//        List<Book> book = bookUtil.getAllBooks();
//        //iterate through the list
//        for (Book book:books){
//            //check if these book id matches the bookId from the parameter
//            if (book.getBookId()==bookId){
//                return book;
//            }
//        }
//        return null;
        //2nd way
        //get the list of books
//        List<Book> books = bookUtil.getAllBooks();
//        Optional<Book> bookOpt = books.stream()
//                .filter(book -> book.getBookId()==bookId)
//                .findFirst();
//        if (bookOpt.isPresent()){
//            return bookOpt.get();
//        }return null;

        //3rd way
        //get the list of books
        List<Book> books = bookUtil.getAllBooks();
        //convert list to stream and filter based on bookId
        return books.stream().filter(book -> book.getBookId()==bookId)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Invalid Id"));
    }
}
