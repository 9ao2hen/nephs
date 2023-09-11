package com.mervyn.nephs.common;

import com.mervyn.nephs.common.code.SuccessCode;

import java.util.function.Function;

public final class Results {

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