package pl.marcinrosol.cloudbookstore.rest.exceptions.author;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AuthorException extends RuntimeException {
    public AuthorException(String message) {
        super(message);
    }
}
