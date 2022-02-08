package com.xinz.retool.resp;
/*
 *  define common type of response to a Http-Request
 * */

public class CommonResp<T> {
    /*
     * if requested service successful or not
     * */
    private boolean success = true;

    /*
     * the message to describe the situation
     * */
    private String message;

    /*
     * the returned data
     * */
    private T content;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final  StringBuffer sb =new StringBuffer("Response:{");
        sb.append("success=").append(success);
        sb.append(", message='").append(message).append('\'');
        sb.append(", content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
