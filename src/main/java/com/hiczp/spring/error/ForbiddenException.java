package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ForbiddenException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.FORBIDDEN;

    public ForbiddenException() {
        super(status);
    }

    public ForbiddenException(String message) {
        super(status, message);
    }

    public ForbiddenException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
