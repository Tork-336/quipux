package com.quipux.exception.model;

public class ErrorDataException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ErrorDataException(String message) {
        super(message);
    }

}
