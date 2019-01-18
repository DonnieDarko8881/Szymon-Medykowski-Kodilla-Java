package com.kodilla.stream.pomiarPredkosci;

import java.util.LinkedList;
import java.util.List;

public class BooksLinkedListService {

    static long begin;
    static long end;

    public void measureRemovingFirstElementTime(List<Book> books, Book book1) {
        begin = System.nanoTime();
        books.remove(book1);
        end = System.nanoTime();
        System.out.println("Removing first element [remove(Object o)] has taken: " + (end - begin) + "ns");
    }

    public void measureRemovingLastElementTime(List<Book> books, Book bookLast) {
        begin = System.nanoTime();
        books.remove(bookLast);
        end = System.nanoTime();
        System.out.println("Removing last element [remove(Object o)] has taken: " + (end - begin) + "ns");
    }

    public void measureAddingElementToBeginOfList(List<Book> books, Book book1) {
        long begin = System.nanoTime();
        books.add(0, book1);
        long end = System.nanoTime();
        System.out.println("Adding element to begin Of LinkedList has taken: " + (end - begin) + "ns");
    }

    public void measureAddingElementToEndOfList(List<Book> books, Book bookLast) {
        begin = System.nanoTime();
        books.add(books.size() - 1, bookLast);
        end = System.nanoTime();
        System.out.println("Adding element to end of Linked List has taken: " + (end - begin) + "ns");
    }


}
