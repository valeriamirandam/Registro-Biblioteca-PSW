package com.library;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    private String title;
    private ArrayList<String> authors;
    private Date editionDate;
    private int pages;
    private String editorial;   
    private String genre;
    private String isbn;
    private String location;
    private String state;
    private String description;
    
    public Book(String title, ArrayList<String> authors, Date editionDate, int pages, String editorial, String genre,
            String isbn, String location, String state, String description) {
        this.title = title;
        this.authors = authors;
        this.editionDate = editionDate;
        this.pages = pages;
        this.editorial = editorial;
        this.genre = genre;
        this.isbn = isbn;
        this.location = location;
        this.state = state;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Date getEditionDate() {
        return editionDate;
    }
    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }
    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
