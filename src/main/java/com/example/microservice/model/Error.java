package com.example.microservice.model;

import java.time.LocalDateTime;

public class Error {
    private int id;
    private String message;
    private String details;
    private LocalDateTime timestamp;

    private String env;

    public Error(int id, String message, String details, LocalDateTime timestamp, String env) {
        this.id = id;
        this.message = message;
        this.details = details;
        this.timestamp = timestamp;
        this.env = env;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
