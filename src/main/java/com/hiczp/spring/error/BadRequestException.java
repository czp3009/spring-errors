package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BadRequestException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.BAD_REQUEST;

    public BadRequestException() {
        super(status);
    }

    public BadRequestException(String message) {
        super(status, message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
