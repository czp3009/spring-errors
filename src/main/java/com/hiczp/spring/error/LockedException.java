package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class LockedException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.LOCKED;

    public LockedException() {
        super(status);
    }

    public LockedException(String message) {
        super(status, message);
    }

    public LockedException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
