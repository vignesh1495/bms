package com.javabrains.Exception;

public class MovieNotFoundException extends RuntimeException{

    public MovieNotFoundException(String s) {
        super(s);
    }
}
