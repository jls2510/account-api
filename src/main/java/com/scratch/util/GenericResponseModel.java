package com.scratch.util;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResponseModel {

    @JsonProperty("Message")
    private String message = null;
    @JsonProperty("Success")
    private boolean success;


    public GenericResponseModel(boolean success, String message) {
        this.message = message;
        this.success = success;

    }
}

