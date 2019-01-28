package com.scratch.util;

public class HttpPassThruException extends Exception {

    String message = null;
    int errorCode = 500;

    public HttpPassThruException(String message) {
        this.message = message;

    }
}
