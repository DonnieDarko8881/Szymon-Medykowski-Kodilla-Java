package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    ///PYTANIE  ^^^^^^^  !!!! jeśli jest fragment mniejszy niż 3 literki wtedy zwraca sie pusta lista,
    // potem jest wywoływan result lista. jest ta lista ma wiecej pozycji niz 20 zwraca się pusta lista,
    // a potem i tak book list przyjmyje result liste i ona jest zwracana. Załóżmy ze ona 15 21 pozycji,
    // to ok zwróci pustą liste ale potem mimo wszystko book lista przyjmuje ten resultat wiec sie zapłeni
    // gdzie jest mój błąd myslenia ?? nie powinno byc jakiegos else czy cos ?
    //dlaczego to działa ?


    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> bookListHandsOF = libraryDatabase.listBooksInHandsOf(libraryUser);

        return bookListHandsOF;
    }
}
