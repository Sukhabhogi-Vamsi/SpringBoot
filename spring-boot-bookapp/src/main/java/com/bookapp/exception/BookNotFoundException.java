package com.bookapp.exception;

import java.io.Serial;

public class BookNotFoundException extends RuntimeException{

    //@Serial
    @Serial
    private static final long serialVersionUID = 1L;
    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}