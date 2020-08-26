package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProxyAuthenticationRequiredException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.PROXY_AUTHENTICATION_REQUIRED;

    public ProxyAuthenticationRequiredException() {
        super(status);
    }

    public ProxyAuthenticationRequiredException(String message) {
        super(status, message);
    }

    public ProxyAuthenticationRequiredException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
