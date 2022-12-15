package com.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public Library(){
        this.books = new ArrayList<Book>();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public void addbook(Book b){
        books.add(b);
    }
}