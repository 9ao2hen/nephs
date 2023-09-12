package com.mervyn.nephs.common.exception;

import lombok.Data;

/**
 * @author 2hen9ao
 * @date 2023/9/12 17:16
 */
@Data
public class ServiceException extends RuntimeException {

    int code;

    public ServiceException(int code) {
        this.code = code;
    }

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
