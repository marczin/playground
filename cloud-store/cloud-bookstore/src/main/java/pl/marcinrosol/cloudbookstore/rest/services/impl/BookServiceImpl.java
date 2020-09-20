package pl.marcinrosol.cloudbookstore.rest.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import pl.marcinrosol.cloudbookstore.rest.exceptions.book.BookIdException;
import pl.marcinrosol.cloudbookstore.rest.exceptions.book.response.BookIdResponse;
import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.models.Book;
import pl.marcinrosol.cloudbookstore.rest.repositories.BookRepository;
import pl.marcinrosol.cloudbookstore.rest.services.BookService;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book){
            bookRepository.findBookByBookId(book.getBookId())
                    .ifPresent(s -> {
                        throw new BookIdException("Book already exist");
                    });
            return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long bookId) {

        Book fetched = bookRepository.findBookByBookId(bookId)
                .orElseThrow(() -> new BookIdException("Book does not exist"));
        return fetched;
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findBooksByTitle(title).get();
    }

    @Override
    public List<Book> getBooksByAuthor(Author author) {
        return bookRepository.findBooksByAuthorName(author.getName()).get();
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findBooksByGenre(genre).get();
    }


}
