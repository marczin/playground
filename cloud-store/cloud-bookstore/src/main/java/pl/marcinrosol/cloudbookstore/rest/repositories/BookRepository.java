package pl.marcinrosol.cloudbookstore.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.marcinrosol.cloudbookstore.rest.models.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookByBookId(Long id);

    @Query("SELECT b FROM Book b WHERE b.title LIKE %:title%")
    Optional<List<Book>> findBooksByTitle(@Param("title") String title);

    @Query("SELECT b FROM Book b WHERE b.author.name LIKE %:name%")
    Optional<List<Book>> findBooksByAuthorName(@Param("name") String name);

    @Query("SELECT b FROM  Book b WHERE b.genre = :genre")
    Optional<List<Book>> findBooksByGenre(@Param("genre") String genre);


}
