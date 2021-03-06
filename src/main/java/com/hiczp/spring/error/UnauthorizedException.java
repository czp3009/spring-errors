package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnauthorizedException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.UNAUTHORIZED;

    public UnauthorizedException() {
        super(status);
    }

    public UnauthorizedException(String message) {
        super(status, message);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
