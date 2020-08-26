package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RequestTimeoutException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.REQUEST_TIMEOUT;

    public RequestTimeoutException() {
        super(status);
    }

    public RequestTimeoutException(String message) {
        super(status, message);
    }

    public RequestTimeoutException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
