package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PreconditionFailedException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.PRECONDITION_FAILED;

    public PreconditionFailedException() {
        super(status);
    }

    public PreconditionFailedException(String message) {
        super(status, message);
    }

    public PreconditionFailedException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
