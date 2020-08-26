package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ConflictException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.CONFLICT;

    public ConflictException() {
        super(status);
    }

    public ConflictException(String message) {
        super(status, message);
    }

    public ConflictException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
