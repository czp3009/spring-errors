package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnavailableForLegalReasonsException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS;

    public UnavailableForLegalReasonsException() {
        super(status);
    }

    public UnavailableForLegalReasonsException(String message) {
        super(status, message);
    }

    public UnavailableForLegalReasonsException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
