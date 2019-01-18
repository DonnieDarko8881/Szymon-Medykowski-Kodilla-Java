package com.kodilla.stream.pomiarPredkosci;

import java.util.Map;

public class BooksHaspMap {

    public Map<String, Book> pushToHashMap(Map<String, Book> mapOfBook, int amountOfElement) {
        for (int i = 0; i < amountOfElement; i++) {
            Book book = new Book("a" + i, "t" + i);
            mapOfBook.put(book.getAuthor(), book);
        }
        return mapOfBook;
    }

}
