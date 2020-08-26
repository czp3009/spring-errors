package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RequestedRangeNotSatisfiableException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE;

    public RequestedRangeNotSatisfiableException() {
        super(status);
    }

    public RequestedRangeNotSatisfiableException(String message) {
        super(status, message);
    }

    public RequestedRangeNotSatisfiableException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
