package pl.marcinrosol.cloudbookstore.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import pl.marcinrosol.cloudbookstore.rest.exceptions.author.AuthorNotFoundException;
import pl.marcinrosol.cloudbookstore.rest.exceptions.author.response.AuthorNotFoundResponse;
import pl.marcinrosol.cloudbookstore.rest.exceptions.book.BookIdException;
import pl.marcinrosol.cloudbookstore.rest.exceptions.book.response.BookIdResponse;

@RestController
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> bookIdException(BookIdException ex, WebRequest request) {
        BookIdResponse exceptionResponse = new BookIdResponse(ex.getMessage());
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> authorNotFoundException(AuthorNotFoundException ex, WebRequest request) {
        AuthorNotFoundResponse exceptionResponse = new AuthorNotFoundResponse(ex.getMessage());
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
