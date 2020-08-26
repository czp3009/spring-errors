package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class IAmATeapotException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.I_AM_A_TEAPOT;

    public IAmATeapotException() {
        super(status);
    }

    public IAmATeapotException(String message) {
        super(status, message);
    }

    public IAmATeapotException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
