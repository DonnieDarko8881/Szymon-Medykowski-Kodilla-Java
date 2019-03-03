package com.kodilla.patterns.singleton;

public class WrongContentException extends RuntimeException {
    private final String message;

    public WrongContentException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
