package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    //returns last title containing the string.
    public String printBooksContaining(String partialBookTitle) {
        String lastTitle= null;
        for (int i = 0; i < books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                System.out.println(books[i]);
                lastTitle=books[i];
            }
        }
        return lastTitle;
    }
}
