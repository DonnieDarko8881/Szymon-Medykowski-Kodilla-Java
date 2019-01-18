package com.kodilla.stream.pomiarPredkosci;

import java.util.LinkedList;
import java.util.List;

public class BooksLinkedList {


    public List<Book> addToLinkedList(List<Book> books, int amoutElements, Book book1, Book bookLast) {
        books.add(book1);
        for (int i = 0; i < amoutElements; i++) {
            books.add(new Book("J.K" + i, "harry" + i));
        }
        books.add(bookLast);
        return books;
    }




}
