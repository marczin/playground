package pl.marcinrosol.cloudbookstore.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.marcinrosol.cloudbookstore.rest.models.Author;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> getAuthorByAuthorId(Long id);

    @Query("SELECT a FROM Author a WHERE a.name = :name AND a.surname = :surname ")
    Optional<Author> getAuthorByFullName(@Param("name") String mame,@Param("surname") String surname);

    @Query("SELECT a FROM Author a WHERE a.name LIKE %:name% ")
    Optional<List<Author>> getAuthorByNameLike(@Param("name") String name);


}
