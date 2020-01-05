package com.company;

public class Book {
    public static final String viewBook = "Paper";
    public String title;
    public String genre;
    public String author;

    public static String getViewBook() {
        return viewBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void info () {
        System.out.println("Имя класса:" + getClass() + " Тип книги: " + viewBook + " Название: " + title
                + " Жанр: " + genre + " Автор: " + author);
    }

}
