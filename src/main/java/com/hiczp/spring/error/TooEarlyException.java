package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class TooEarlyException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.TOO_EARLY;

    public TooEarlyException() {
        super(status);
    }

    public TooEarlyException(String message) {
        super(status, message);
    }

    public TooEarlyException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
