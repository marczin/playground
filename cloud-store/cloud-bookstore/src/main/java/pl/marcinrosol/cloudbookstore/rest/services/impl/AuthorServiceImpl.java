package pl.marcinrosol.cloudbookstore.rest.services.impl;

import org.springframework.stereotype.Service;
import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.services.AuthorService;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Override
    public Author addAuthor(Author author) {
        return null;
    }

    @Override
    public Author getById(Long authorId) {
        return null;
    }

    @Override
    public List<Author> getAuthorsLikeName(String author) {
        return null;
    }

}
