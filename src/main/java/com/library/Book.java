package com.library;

public class Book {
    private String title;
    private String authors;
    private String editionDate;
    private String pages;
    private String editorial;   
    private String genre;
    private String isbn;
    private String location;
    private String state;
    private String description;
    
    public Book(String title, String authors, String editionDate, String pages, String editorial, String genre,
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
    public String getPages() {
        return pages;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }
    public String getEditionDate() {
        return editionDate;
    }
    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }
    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void showBook(){
        String info = String.format("Título: %s\nAutor(es): %s\nFecha Edición: %s\nNúmero de páginas: %s\nEditorial: %s\nGénero: %s\nISBN: %s\nUbicación: %s\nEstado: %s\nDescripción: %s\n", this.title, this.authors, this.editionDate, this.pages, this.editorial, this.genre, this.isbn,this.location,this.state,this.description);
        System.out.println(info);
    }
}
