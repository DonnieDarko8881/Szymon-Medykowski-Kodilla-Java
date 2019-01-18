package com.kodilla.stream.pomiarPredkosci;

import java.util.Map;

public class BooksHashMapService {
    static long begin;
    static long end;

    public void measureGettingElementFromHashMap(Map<String, Book> mapOfBook) {
        begin = System.nanoTime();
        mapOfBook.get("a5");
        end = System.nanoTime();
        System.out.println("Getting element From HashMap has taken: " + (end - begin) + "ns");
    }

    public void measureRemovingElementFromHashMap(Map<String, Book> mapOfBook) {
        begin = System.nanoTime();
        mapOfBook.remove("a9");
        end = System.nanoTime();
        System.out.println("Removing element From HashMap has taken: " + (end - begin) + "ns");
    }

    public void measureAddingElementToHashMap(Map<String, Book> mapOfBook) {
        begin = System.nanoTime();
        mapOfBook.put("added", new Book("aother", "tOther"));
        end = System.nanoTime();
        System.out.println("Removing element From HashMap has taken: " + (end - begin) + "ns");
    }

}
