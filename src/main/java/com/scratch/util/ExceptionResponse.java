package com.scratch.util;


public class ExceptionResponse {
    private String message;
    private String error;

    public String getMessage() {
        return message;
    }

    public ExceptionResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getError() {
        return error;
    }

    public ExceptionResponse setError(String error) {
        this.error = error;
        return this;
    }
}
