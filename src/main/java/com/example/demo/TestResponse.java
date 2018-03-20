package com.example.demo;

public class TestResponse {

    private String status;
    private int code;

    public TestResponse() {
    }

    public TestResponse(String status, int code) {
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
