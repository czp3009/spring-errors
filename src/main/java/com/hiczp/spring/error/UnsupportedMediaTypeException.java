package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnsupportedMediaTypeException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.UNSUPPORTED_MEDIA_TYPE;

    public UnsupportedMediaTypeException() {
        super(status);
    }

    public UnsupportedMediaTypeException(String message) {
        super(status, message);
    }

    public UnsupportedMediaTypeException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
