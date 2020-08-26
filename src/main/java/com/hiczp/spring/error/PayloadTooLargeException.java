package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PayloadTooLargeException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.PAYLOAD_TOO_LARGE;

    public PayloadTooLargeException() {
        super(status);
    }

    public PayloadTooLargeException(String message) {
        super(status, message);
    }

    public PayloadTooLargeException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
