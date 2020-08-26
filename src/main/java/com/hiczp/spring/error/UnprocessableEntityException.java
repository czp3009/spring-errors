package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnprocessableEntityException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;

    public UnprocessableEntityException() {
        super(status);
    }

    public UnprocessableEntityException(String message) {
        super(status, message);
    }

    public UnprocessableEntityException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
