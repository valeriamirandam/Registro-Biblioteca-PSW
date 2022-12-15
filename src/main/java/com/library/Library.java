package com.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    //Registrar un libro
    public void addbook(ArrayList<Book> books, Book b){
        books.add(b);
    }
}