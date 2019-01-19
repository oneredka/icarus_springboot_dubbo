package me.hong.comment;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import me.hong.comment.utils.JsonUtils;

import java.io.Serializable;


@JsonInclude(Include.NON_NULL)
public class RestResult<T> implements Serializable {
    private int status;
    private String code;
    private String msg;
    private T data;

    public static <T> RestResult<T> success(T data) {
        return new RestResult(1, "success", "success", data);
    }

    public static RestResult<String> success() {
        return success("");
    }

    public RestResult() {
    }

    public RestResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RestResult(int status, String code, String msg, T data) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RestResult status(int status) {
        this.status = status;
        return this;
    }

    public RestResult code(String code) {
        this.code = code;
        return this;
    }

    public RestResult msg(String msg) {
        this.msg = msg;
        return this;
    }

    public RestResult data(T data) {
        this.data = data;
        return this;
    }

    public String toJson() {
        return JsonUtils.toJson(this);
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
