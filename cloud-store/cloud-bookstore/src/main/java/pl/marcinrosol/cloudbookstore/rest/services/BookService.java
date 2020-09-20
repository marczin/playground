package pl.marcinrosol.cloudbookstore.rest.services;


import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book addBook(Book book) throws Exception;

    Book getBookById(Long bookId);
    List<Book> getBooksByTitle(String title);
    List<Book>  getBooksByAuthor(Author author);
    List<Book> getBooksByGenre(String genre);

}
