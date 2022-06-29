package se.lexicon.Author;

import java.util.Arrays;

public class Author {

    private String name;
    private int birthYear;

    private Book[] allBooks = new Book[0];



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Book[] getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(Book[] allBooks) {
        this.allBooks = allBooks;
    }

//    public String authorInfo() {
//        return "Full name: " + name + "Birth year: " + birthYear + "Books:" + Arrays.toString(allBooks);



    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", allBooks=" + Arrays.toString(allBooks) +
                '}';
    }

    public void setAllauthors(Author[] bookAurthors) {
    }
}



