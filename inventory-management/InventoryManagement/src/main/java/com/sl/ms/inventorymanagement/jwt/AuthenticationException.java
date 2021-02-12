package com.sl.ms.inventorymanagement.jwt;

public class AuthenticationException  extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
