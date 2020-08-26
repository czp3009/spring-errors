package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UriTooLongException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.URI_TOO_LONG;

    public UriTooLongException() {
        super(status);
    }

    public UriTooLongException(String message) {
        super(status, message);
    }

    public UriTooLongException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
