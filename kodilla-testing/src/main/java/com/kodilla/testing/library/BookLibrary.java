package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        if (titleFragment.length() < 3) {
            return emptyList();
        }

        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            return emptyList();
        }

        return resultList;
    }


    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
