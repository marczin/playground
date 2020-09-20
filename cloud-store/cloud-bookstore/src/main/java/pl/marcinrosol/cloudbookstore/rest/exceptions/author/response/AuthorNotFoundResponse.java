package pl.marcinrosol.cloudbookstore.rest.exceptions.author.response;

public class AuthorNotFoundResponse {

    private String AuthorNotFound;

    public AuthorNotFoundResponse(String authorNotFound) {
        AuthorNotFound = authorNotFound;
    }

    public String getAuthorNotFound() {
        return AuthorNotFound;
    }

    public void setAuthorNotFound(String authorNotFound) {
        AuthorNotFound = authorNotFound;
    }
}
