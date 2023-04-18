package com.example.tciAsses.response;

public class BaseResponse {

    public static final int SUCCESS = 1;

    public static final int FAILED = 0;

    private String errorMessage;



    public BaseResponse() {
    }

    public String getErrorMessage() {
        if(errorMessage!=null)
            return errorMessage;
        return "";
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
