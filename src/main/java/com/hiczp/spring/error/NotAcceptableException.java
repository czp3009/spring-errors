package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NotAcceptableException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.NOT_ACCEPTABLE;

    public NotAcceptableException() {
        super(status);
    }

    public NotAcceptableException(String message) {
        super(status, message);
    }

    public NotAcceptableException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
