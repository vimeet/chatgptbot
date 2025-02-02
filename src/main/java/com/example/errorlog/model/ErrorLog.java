package com.example.errorlog.model;

public class ErrorLog {

    private Long id;

    private String exception;
    private Long timestamp;
    private String env;
    private String pod;

    public ErrorLog(String exception, Long timestamp, String env, String pod) {
        this.exception = exception;
        this.timestamp = timestamp;
        this.env = env;
        this.pod = pod;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }
}
