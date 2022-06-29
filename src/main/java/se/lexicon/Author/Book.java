package se.lexicon.Author;

import java.util.Arrays;

public class Book {


    private String title;
    private String isbn;

    private Author[] allauthors = new Author[0];


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author[] getAllauthors() {
        return allauthors;
    }

    public void setAllauthors(Author[] allauthors) {
        this.allauthors = allauthors;
    }


//    public String bookInfo(){
//        return "Book title: " + this.title + "Isbn: " + this.isbn + "Author:" + author;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

