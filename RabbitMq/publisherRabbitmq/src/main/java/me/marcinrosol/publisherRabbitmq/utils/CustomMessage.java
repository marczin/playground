package me.marcinrosol.publisherRabbitmq.utils;

public class CustomMessage {

    private String message;

    public CustomMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
