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
        BookService bookServiceMock = new Mockito().mock(BookService.class);
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
        BookService bookServiceMock = new Mockito().mock(BookService.class);
        BookDto bookDtoMock = new Mockito().mock(BookDto.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> list = new ArrayList<>();
        Mockito.when(bookServiceMock.addBooks(bookDtoMock)).then(list.add(bookDtoMock));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(list);

        bookController.addBook(new BookDto("1", "11"));

        Assertions.assertEquals(1, list.size());
    }
}
