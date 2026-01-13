package com.example.exception.handler;

/**
 * Created by manikandan.marimuthu on 12-01-2026.
 * Author: manikandan.marimuthu
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
