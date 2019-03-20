package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LibraryTestSuite {

    @Test(expected = CloneNotSupportedException.class)
    public void shouldReturn3booksInShallowCopyTest() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Harry Potter");
        Book harry1 = new Book("Harry Potter and the Philosopher's Stone", "J.k Rowling ",
                LocalDate.of(1997, 6, 26));
        Book harry2 = new Book("Harry Potter and The Chamber of Secrets ", "J.k Rowling ",
                LocalDate.of(1998, 6, 26));
        Book harry3 = new Book("Harry Potter and The Prisoner of Azkaban ", "J.k Rowling ",
                LocalDate.of(1999, 6, 26));

        library.getBooks().add(harry1);
        library.getBooks().add(harry2);
        library.getBooks().add(harry3);

        //when
        Library cloneLibrary = null;

        cloneLibrary = library.shallowCopy();
        cloneLibrary.setName("Harry Potter in Ostrow WLKP");


        //Then
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
    }


    @Test(expected = CloneNotSupportedException.class)
    public void shouldReturn2booksInDeepCloneTest() throws CloneNotSupportedException {
        //Given
        Library library = new Library("Harry Potter");
        Book harry1 = new Book("Harry Potter and the Philosopher's Stone", "J.k Rowling ",
                LocalDate.of(1997, 6, 26));
        Book harry2 = new Book("Harry Potter and The Chamber of Secrets ", "J.k Rowling ",
                LocalDate.of(1998, 6, 26));
        Book harry3 = new Book("Harry Potter and The Prisoner of Azkaban ", "J.k Rowling ",
                LocalDate.of(1999, 6, 26));

        library.getBooks().add(harry1);
        library.getBooks().add(harry2);
        library.getBooks().add(harry3);

        Library deepClonedLibrary = null;

        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Harry potter in Warsaw");


        //When
        library.getBooks().remove(harry3);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}