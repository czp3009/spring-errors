package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class FailedDependencyException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.FAILED_DEPENDENCY;

    public FailedDependencyException() {
        super(status);
    }

    public FailedDependencyException(String message) {
        super(status, message);
    }

    public FailedDependencyException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
