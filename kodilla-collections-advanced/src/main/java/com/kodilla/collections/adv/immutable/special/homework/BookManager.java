package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    static Set<Book> lists = new HashSet<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        lists.add(newBook);
        return newBook;
    }

}
