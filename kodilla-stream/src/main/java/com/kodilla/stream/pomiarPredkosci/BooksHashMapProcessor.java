package com.kodilla.stream.pomiarPredkosci;

import java.util.Map;

public class BooksHashMapProcessor {
    private final BooksHashMapService booksHashMapService;
    private final BooksHaspMap booksHaspMap;

    public BooksHashMapProcessor(BooksHashMapService booksHashMapService, BooksHaspMap booksHaspMap) {
        this.booksHashMapService = booksHashMapService;
        this.booksHaspMap = booksHaspMap;
    }

    public void process(Map<String, Book> mapOfBook) {
        booksHaspMap.pushToHashMap(mapOfBook, 2000000);
        booksHashMapService.measureGettingElementFromHashMap(mapOfBook);
        booksHashMapService.measureAddingElementToHashMap(mapOfBook);
        booksHashMapService.measureRemovingElementFromHashMap(mapOfBook);
    }
}
