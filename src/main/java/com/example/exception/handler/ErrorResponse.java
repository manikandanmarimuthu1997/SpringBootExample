package com.example.exception.handler;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by manikandan.marimuthu on 12-01-2026.
 * Author: manikandan.marimuthu
 */

@Data
public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
