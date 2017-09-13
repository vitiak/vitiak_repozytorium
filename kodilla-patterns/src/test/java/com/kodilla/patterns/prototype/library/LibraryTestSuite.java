package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Book book1 = new Book("Druzyna Pierscienia", "Tolkien", LocalDate.of(1954, 11, 23));
        Book book2 = new Book("Dwie Wieże", "Tolkien", LocalDate.of(1955, 11, 23));
        Book book3 = new Book("Powrot Krola", "Tolkien", LocalDate.of(1956, 11, 23));
        Book book4 = new Book("Opowiesci z Narnii", "C.S.Lewis", LocalDate.of(1950, 11, 23));
        Book book5 = new Book("Listy starego diabla do mlodego", "C.S.Lewis", LocalDate.of(1942, 11, 23));
        Book book6 = new Book("Odruch litosci", "Clifford", LocalDate.of(1954, 11, 23));
        Book book7 = new Book("Ale klub nie przebacza", "Clifford", LocalDate.of(1950, 11, 23));
        Book book8 = new Book("Zegnaj Grosvenor Square", "Clifford", LocalDate.of(1954, 11, 23));
        Book book9 = new Book("Maly swiatek Don Camillo", "Guareschi", LocalDate.of(1952, 11, 23));
        Book book10 = new Book("Don Camillo i posel Peppone", "Guareschi", LocalDate.of(1955, 11, 23));

        Library library = new Library("library1");
        library.books.add(book1);
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);
        library.books.add(book6);
        library.books.add(book7);
        library.books.add(book8);
        library.books.add(book9);
        library.books.add(book10);


/**/
      //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

/**/
        //When
        int sizeSet = library.getBooks().size();


        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(10, sizeSet);
        Assert.assertEquals(10, clonedLibrary.books.size());
        Assert.assertEquals(10, deepClonedLibrary.books.size());
        Assert.assertEquals(clonedLibrary.books, library.books);
        Assert.assertEquals(deepClonedLibrary.books, library.books);

    }


}
