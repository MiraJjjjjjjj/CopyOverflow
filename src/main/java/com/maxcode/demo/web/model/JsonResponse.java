package com.maxcode.demo.web.model;


public class JsonResponse {

    private Integer code;
    private String message;
    private String status;
    private Object result;

    public JsonResponse(Integer code, String message, String status, Object result) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.result = result;
    }

    public static JsonResponse success(Object result) {
        return new JsonResponse(200, "", "OK", result);
    }

    public static JsonResponse failure(Integer code, String message, Object result) {
        return new JsonResponse(code, message, "KO", result);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

}
