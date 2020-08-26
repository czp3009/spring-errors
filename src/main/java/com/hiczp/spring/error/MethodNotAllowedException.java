package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class MethodNotAllowedException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.METHOD_NOT_ALLOWED;

    public MethodNotAllowedException() {
        super(status);
    }

    public MethodNotAllowedException(String message) {
        super(status, message);
    }

    public MethodNotAllowedException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
