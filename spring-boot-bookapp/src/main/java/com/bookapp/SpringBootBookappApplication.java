package com.bookapp;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookappApplication.class, args);
	}
	@Autowired
	private IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		bookService.getAll().forEach(System.out::println);
		System.out.println();
		System.out.println("By Author");
		bookService.getByAuthor("Robin").forEach(System.out::println);
		System.out.println();

		System.out.println("By Category");
		bookService.getByCategory("Tech").forEach(System.out::println);
		System.out.println();

		System.out.println("By starting title");
		bookService.getByTitleStarting("J").forEach(System.out::println);
		System.out.println();

		System.out.println("By Category");
		bookService.getByLesserPrice("Java in Action",800).forEach(System.out::println);
		System.out.println();

		System.out.println("By Id");
		com.bookapp.model.Book book1 = bookService.getById(1);
		System.out.println(book1);

	}

	public static class Book {
    }
}
