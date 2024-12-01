package lesson3.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;

    protected Book addBook(Book book) {
        books.add(book);
        return book;
    }

    protected List<Book> findByName(String bookName) {
        return books.stream()
                .filter(book -> book.getTitle().equals(bookName))
                .collect(Collectors.toList());
    }

    protected  List<Book> findAllAvailableBooks() {
        return books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
    }
}
