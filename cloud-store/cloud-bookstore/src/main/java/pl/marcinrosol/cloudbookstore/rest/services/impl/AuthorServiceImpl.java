package pl.marcinrosol.cloudbookstore.rest.services.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.marcinrosol.cloudbookstore.rest.exceptions.author.AuthorException;
import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.repositories.AuthorRepository;
import pl.marcinrosol.cloudbookstore.rest.services.AuthorService;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;


    @Override
    public Author addAuthor(Author author) {
        log.info("Author service");
        authorRepository.getAuthorByFullName(author.getName(), author.getSurname())
                .ifPresent( a -> {
                    throw new AuthorException("Author already exist");
                });
        log.info("autor service 2");
        return authorRepository.save(author);
    }

    @Override
    public Author getById(Long authorId) {
        return authorRepository.getAuthorByAuthorId(authorId).get();
    }

    @Override
    public List<Author> getAuthorsLikeName(String author) {
        return authorRepository.getAuthorByNameLike(author).get();
    }

}
