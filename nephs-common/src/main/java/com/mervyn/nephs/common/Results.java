package com.mervyn.nephs.common;

import com.mervyn.nephs.common.code.ErrorCode;
import com.mervyn.nephs.common.code.SuccessCode;

import java.util.function.Function;

public final class Results {


    public static Result<Void> error(ErrorCode code){
        return new DefaultResult<Void>()
                .setCode(code.code())
                .setMessage(code.message());
    }

    public static Result<Void> error(int code,String eMsg){
        return new DefaultResult<Void>()
                .setCode(String.valueOf(code))
                .setMessage(eMsg);
    }

    public static Result<Void> error(String eMsg,ErrorCode code){
        return new DefaultResult<Void>()
                .setCode(code.code())
                .setMessage(eMsg);
    }

    public static <T> Result<T> success(T data,String msg) {
        return new DefaultResult<T>()
                .setCode(success().getCode())
                .setMessage(msg)
                .setData(data);
    }

    /**
     * 成功
     * @return Result<Void>
     */
    public static Result<Void> success() {
        return new DefaultResult<Void>()
                .setCode(SuccessCode.SUCCESS.code())
                .setMessage(SuccessCode.SUCCESS.message());
    }

    /**
     * 成功
     * @param data 并设置data参数
     * @param <T> data的泛型
     * @return Result<T>
     */
    public static <T> Result<T> success(T data) {
        return new DefaultResult<T>()
                .setCode(SuccessCode.SUCCESS.code())
                .setMessage(SuccessCode.SUCCESS.message()).setData(data);
    }
    public static <T, R> Result<R> success(T data, Function<T, R> transTFunction) {
        return new DefaultResult<R>()
                .setCode(SuccessCode.SUCCESS.code())
                .setMessage(SuccessCode.SUCCESS.message()).setData(transTFunction.apply(data));
    }

}