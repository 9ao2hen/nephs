package com.mervyn.nephs.common;

import java.io.Serializable;

public class DefaultResult<T> implements Result<T>, Serializable {

    private static final long serialVersionUID = 9086610846622852957L;
    private static final String SUCCESS_CODE = "0";
    private static final String UNKNOWN_ERROR = "1";
    private static final String ERROR_PREFIX = "SYS_";

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 异常类名
     */
    private String errorClass;

    /**
     * 详细异常信息
     */
    private String errorStack;


    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public T getData() {
        return data;
    }


    @Override
    public String getErrorClass() {
        return errorClass;
    }

    @Override
    public String getErrorStack() {
        return errorStack;
    }

    @Override
    public DefaultResult<T> setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public DefaultResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public DefaultResult<T> setData(T data) {
        this.data = data;
        return this;
    }


    @Override
    public DefaultResult<T> setErrorClass(String errorClass) {
        this.errorClass = errorClass;
        return this;
    }

    @Override
    public DefaultResult<T> setErrorStack(String errorStack) {
        this.errorStack = errorStack;
        return this;
    }


    @Override
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

    @Override
    public boolean isError() {
        return UNKNOWN_ERROR.equals(code) ||
                (code != null && code.startsWith(ERROR_PREFIX));
    }

    @Override
    public boolean isFailure() {
        return (!isSuccess()) && (!isError());
    }

    /**
     * ViolationItem的实现
     *
     * @author freeway
     */


    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}