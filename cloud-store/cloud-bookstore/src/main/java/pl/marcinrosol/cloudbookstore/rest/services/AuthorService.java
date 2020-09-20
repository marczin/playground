package pl.marcinrosol.cloudbookstore.rest.services;


import pl.marcinrosol.cloudbookstore.rest.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Author addAuthor(Author author);

    Author getById(Long authorId);

    List<Author> getAuthorsLikeName(String author);

}
