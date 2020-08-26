package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GoneException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.GONE;

    public GoneException() {
        super(status);
    }

    public GoneException(String message) {
        super(status, message);
    }

    public GoneException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
