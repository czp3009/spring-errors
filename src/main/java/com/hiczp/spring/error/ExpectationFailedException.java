package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ExpectationFailedException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.EXPECTATION_FAILED;

    public ExpectationFailedException() {
        super(status);
    }

    public ExpectationFailedException(String message) {
        super(status, message);
    }

    public ExpectationFailedException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
