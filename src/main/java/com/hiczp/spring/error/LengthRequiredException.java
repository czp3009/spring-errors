package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class LengthRequiredException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.LENGTH_REQUIRED;

    public LengthRequiredException() {
        super(status);
    }

    public LengthRequiredException(String message) {
        super(status, message);
    }

    public LengthRequiredException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
