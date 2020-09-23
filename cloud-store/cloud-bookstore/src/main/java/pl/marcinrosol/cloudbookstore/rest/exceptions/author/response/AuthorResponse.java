package pl.marcinrosol.cloudbookstore.rest.exceptions.author.response;

import lombok.Data;

public class AuthorResponse {
    String author;

    public AuthorResponse(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
