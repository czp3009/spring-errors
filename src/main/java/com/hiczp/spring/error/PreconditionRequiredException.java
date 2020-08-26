package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PreconditionRequiredException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.PRECONDITION_REQUIRED;

    public PreconditionRequiredException() {
        super(status);
    }

    public PreconditionRequiredException(String message) {
        super(status, message);
    }

    public PreconditionRequiredException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
