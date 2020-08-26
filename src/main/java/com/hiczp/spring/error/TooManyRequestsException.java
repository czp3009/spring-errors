package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TooManyRequestsException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.TOO_MANY_REQUESTS;

    public TooManyRequestsException() {
        super(status);
    }

    public TooManyRequestsException(String message) {
        super(status, message);
    }

    public TooManyRequestsException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
