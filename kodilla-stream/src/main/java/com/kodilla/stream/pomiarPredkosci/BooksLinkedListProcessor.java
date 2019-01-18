package com.kodilla.stream.pomiarPredkosci;

import java.util.List;

public class BooksLinkedListProcessor {

    private BooksLinkedListService booksLinkedListService;
    private BooksLinkedList booksLinkedList;

    public BooksLinkedListProcessor(BooksLinkedListService booksLinkedListService, BooksLinkedList booksLinkedList) {
        this.booksLinkedListService = booksLinkedListService;
        this.booksLinkedList = booksLinkedList;
    }

    public void process(List<Book> books, Book book1, Book bookLast) {
        booksLinkedList.addToLinkedList(books, 2000000, book1, bookLast);

        booksLinkedListService.measureRemovingFirstElementTime(books, book1);
        booksLinkedListService.measureRemovingLastElementTime(books, bookLast);
        booksLinkedListService.measureAddingElementToBeginOfList(books, book1);
        booksLinkedListService.measureAddingElementToEndOfList(books, bookLast);

    }
}
