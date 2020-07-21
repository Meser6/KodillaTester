package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> lists = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        lists.add(newBook);
        return newBook;
    }
}
