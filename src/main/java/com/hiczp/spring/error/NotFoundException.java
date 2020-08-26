package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NotFoundException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.NOT_FOUND;

    public NotFoundException() {
        super(status);
    }

    public NotFoundException(String message) {
        super(status, message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
