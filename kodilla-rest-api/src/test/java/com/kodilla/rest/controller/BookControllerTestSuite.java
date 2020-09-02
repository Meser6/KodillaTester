package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        bookList.add(new BookDto("1", "11"));
        bookList.add(new BookDto("2", "22"));

        List<BookDto> result = bookController.getBooks();

        assertEquals(2, result.size());
    }

    @Test
    public void shouldAddBook() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookDto bookDto = new BookDto("1", "11");
        BookController bookController = new BookController(bookServiceMock);
        Mockito.when(bookServiceMock.addBook(bookDto)).thenReturn(true);

        boolean added = bookController.addBook(bookDto);

        Assertions.assertTrue(added);
    }
}
