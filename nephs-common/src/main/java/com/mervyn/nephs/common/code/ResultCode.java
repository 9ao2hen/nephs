package com.mervyn.nephs.common.code;

public interface ResultCode {

    /**
     * 异常响应码标识
     */
    String SYS = "SYS";

    /**
     * 通用响应码标识
     */
    String COMMON = "C";

    /**
     * 通用响应码标识
     */
    String AUTH = "AUTH";

    /**
     * 获取相应码
     */
    String code();

    /**
     * 获取响应码信息
     */
    String message();

}