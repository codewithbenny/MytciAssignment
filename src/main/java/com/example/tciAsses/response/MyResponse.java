package com.example.tciAsses.response;

import com.example.tciAsses.model.Data;

import java.util.List;

public class MyResponse {
    private String errorMessage;
    private List<Data> data;

    public MyResponse() {}

    public MyResponse(List<Data> data) {
        this.data = data;
    }

    public String getErrorMessage() {
        if(errorMessage==null)
            return "";
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
