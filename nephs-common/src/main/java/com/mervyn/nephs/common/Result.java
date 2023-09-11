package com.mervyn.nephs.common;

import java.io.Serializable;

/**
 * @author 2hen9ao
 * @date 2023/9/8 20:17
 */
public interface Result<T> extends Serializable {

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    String getCode();

    /**
     * 获取成功或错误的信息
     *
     * @return 成功或错误的信息
     */
    String getMessage();

    /**
     * 获取数据
     *
     * @return 数据
     */
    T getData();


    /**
     * 获取错误的异常类
     *
     * @return 错误的异常类
     */
    String getErrorClass();

    /**
     * 获取错误的异常堆栈
     *
     * @return 错误的异常堆栈
     */
    String getErrorStack();

    /**
     * 设置错误码
     *
     * @param code 错误码
     * @return Result对象
     */
    Result<T> setCode(String code);

    /**
     * 设置成功或错误的信息
     *
     * @param message 成功或错误的信息
     * @return Result
     */
    Result<T> setMessage(String message);

    /**
     * 设置数据
     *
     * @param data 数据
     * @return Result
     */
    Result<T> setData(T data);


    /**
     * 设置错误的异常类
     *
     * @param errorClass 错误的异常类
     * @return Result
     */
    Result<T> setErrorClass(String errorClass);

    /**
     * 设置错误的异常堆栈
     *
     * @param errorStack 错误的异常堆栈
     * @return Result
     */
    Result<T> setErrorStack(String errorStack);

    /**
     * 是否成功
     *
     * @return boolean
     */
    boolean isSuccess();

    /**
     * 是否错误
     *
     * @return boolean
     */
    boolean isError();

    /**
     * 是否是业务处理失败，业务异常
     *
     * @return boolean
     */
    boolean isFailure();


}
