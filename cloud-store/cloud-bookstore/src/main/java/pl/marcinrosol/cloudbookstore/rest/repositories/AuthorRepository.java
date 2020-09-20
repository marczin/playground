package pl.marcinrosol.cloudbookstore.rest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.marcinrosol.cloudbookstore.rest.models.Author;

import java.util.Optional;

@Repository
public interface AuthorRepository {

    Optional<Author> getAuthorByAuthorId(Long id);

    @Query("SELECT a FROM Author a WHERE a.name = :name AND a.surname = :surname ")
    Optional<Author> getAuthorByFullName(String mame, String surname);



}
