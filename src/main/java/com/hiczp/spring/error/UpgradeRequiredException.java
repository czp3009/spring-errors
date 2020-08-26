package com.hiczp.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UpgradeRequiredException extends ResponseStatusException {
    private static final HttpStatus status = HttpStatus.UPGRADE_REQUIRED;

    public UpgradeRequiredException() {
        super(status);
    }

    public UpgradeRequiredException(String message) {
        super(status, message);
    }

    public UpgradeRequiredException(String message, Throwable cause) {
        super(status, message, cause);
    }
}
