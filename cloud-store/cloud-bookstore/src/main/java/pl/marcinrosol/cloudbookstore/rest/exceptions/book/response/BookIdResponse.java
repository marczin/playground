package pl.marcinrosol.cloudbookstore.rest.exceptions.book.response;

public class BookIdResponse {

    private String BookIdResponse;

    public BookIdResponse(String bookIdResponse) {
        BookIdResponse = bookIdResponse;
    }

    public String getBookIdResponse() {
        return BookIdResponse;
    }

    public void setBookIdResponse(String bookIdResponse) {
        BookIdResponse = bookIdResponse;
    }
}
