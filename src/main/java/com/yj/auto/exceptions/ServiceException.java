package com.yj.auto.exceptions;

import lombok.Data;

@Data
public class ServiceException extends RuntimeException{
    private Integer code = 300;

    private String msg = "参数异常";

    public ServiceException() {
        super("参数异常");
    }

    public ServiceException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ServiceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ServiceException(Integer code) {
        super("参数异常");
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
