package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PaymentRequiredException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.PAYMENT_REQUIRED;

    public PaymentRequiredException() {
        super(status);
    }

    public PaymentRequiredException(String message) {
        super(status, message);
    }

    public PaymentRequiredException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
