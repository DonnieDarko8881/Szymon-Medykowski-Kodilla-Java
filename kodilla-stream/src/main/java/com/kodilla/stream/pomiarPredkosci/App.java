package com.kodilla.stream.pomiarPredkosci;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        BooksLinkedList booksLinkedList = new BooksLinkedList();
        BooksLinkedListService booksLinkedListService = new BooksLinkedListService();
        BooksLinkedListProcessor booksLinkedListProcessor = new BooksLinkedListProcessor(booksLinkedListService,
                booksLinkedList);

        BooksHaspMap booksHaspMap = new BooksHaspMap();
        BooksHashMapService booksHashMapService = new BooksHashMapService();
        BooksHashMapProcessor booksHashMapProcessor = new BooksHashMapProcessor(booksHashMapService,booksHaspMap);

        List books = new LinkedList<>();
        Map<String, Book> mapOfBook = new HashMap<>();

        Book book1 = new Book("firstAdding", "FirstAddingTitle");
        Book bookLast = new Book("LastAdding", "LastAddingTitle");

        booksLinkedListProcessor.process(books,book1,bookLast);
        booksHashMapProcessor.process(mapOfBook);
    }





}
