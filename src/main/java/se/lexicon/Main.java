package se.lexicon;

import se.lexicon.Author.Author;
import se.lexicon.Author.Book;

import se.lexicon.Car.Car;

import se.lexicon.Rectangle.Rectangle;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main carModel = new Main();
        carModel.newCar();

        Main recArea = new Main();
        double area = recArea.formRect();
        System.out.println(area);

        Main authorsBooks = new Main();
        authorsBooks.bookAuthor();
    }


    private void newCar() {

        Car volvo = new Car();

        volvo.id = "123456";
        volvo.year = "1927";
        volvo.model = "Volvo ÖV4";
        volvo.colour = "Dark blue";
        volvo.motorSize = "4-cylindrical";

        System.out.println(volvo.drive());
    }


    public double formRect() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Can you enter height and width? ");

        double doubleHight = userInput.nextDouble();
        double doubleWidth = userInput.nextDouble();

        Rectangle rect = new Rectangle(doubleHight, doubleWidth);
        return rect.getArea();
    }

    private void bookAuthor() {

        Author authorKeith = new Author();
        authorKeith.setName("Keith Houston");
        authorKeith.setBirthYear(1977);

        Author[] bookAurthors = new Author[1];
        bookAurthors[0] = authorKeith;
        authorKeith.setAllauthors(bookAurthors);


        Author authorStefan = new Author();
        authorStefan.setName("Stefan Stefansson");
        authorStefan.setBirthYear(1988);

        Author[] bookAurthors2 = new Author[1];
        bookAurthors2[0] = authorStefan;
        authorStefan.setAllauthors(bookAurthors2);


        Author authorSimon = new Author();
        authorSimon.setName("Simon Simonsson");
        authorSimon.setBirthYear(1997);

        Author[] bookAurthors3 = new Author[1];
        bookAurthors3[0] = authorSimon;
        authorSimon.setAllauthors(bookAurthors3);


        Book bookOne = new Book();
        bookOne.setTitle("The Book 1");
        bookOne.setIsbn("B016KORW");

        bookOne.setAllauthors(new Author[]{authorKeith});
        authorKeith.setAllBooks(new Book[]{bookOne});

        Book[] keithsBooks = new Book[1];
        keithsBooks[0] = bookOne;
        authorKeith.setAllBooks(keithsBooks);


        Book bookTwo = new Book();
        bookTwo.setTitle("The Book 2");
        bookTwo.setIsbn("B017KORW");

        bookTwo.setAllauthors(new Author[]{authorStefan});
        authorStefan.setAllBooks(new Book[]{bookTwo});

        Book[] stefansBooks = new Book[1];
        stefansBooks[0] = bookTwo;
        authorStefan.setAllBooks(stefansBooks);


        Book bookThree = new Book();
        bookThree.setTitle("The Book 3");
        bookThree.setIsbn("B018KORW");

        bookThree.setAllauthors(new Author[]{authorSimon});
        authorSimon.setAllBooks(new Book[]{bookThree});

        Book[] simonBooks = new Book[1];
        simonBooks[0] = bookThree;
        authorSimon.setAllBooks(simonBooks);


        System.out.println(bookOne + authorKeith.getName());
        System.out.println(bookTwo + authorKeith.getName());
        System.out.println(bookThree + authorKeith.getName());

        System.out.println(authorKeith.getName() + " " + bookOne);
        System.out.println(authorStefan.getName() + " " + bookTwo);
        System.out.println(authorSimon.getName() + " " + bookThree + bookTwo);


        ArrayList<String> Keithlist = new ArrayList<>();

        Keithlist.add("The author Keith Houston has written:");
        Keithlist.add(bookOne.getTitle());
        Keithlist.add(bookTwo.getTitle());

        System.out.println(Keithlist);


        ArrayList<String> bookOnelist = new ArrayList<>();

        bookOnelist.add("The Book 1 is written by:");
        bookOnelist.add(authorKeith.getName());
        bookOnelist.add(authorStefan.getName());

        System.out.println(bookOnelist);
    }
}
