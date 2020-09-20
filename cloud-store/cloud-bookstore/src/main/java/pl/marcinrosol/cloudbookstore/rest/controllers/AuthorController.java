package pl.marcinrosol.cloudbookstore.rest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinrosol.cloudbookstore.rest.models.Author;
import pl.marcinrosol.cloudbookstore.rest.services.AuthorService;

@RestController
@AllArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    public ResponseEntity<Author> addAuthor(Author author){
        return ResponseEntity
                .ok()
                .body(author);
    }
}
