package com.mervyn.nephs.common.code;

public enum ErrorCode implements ResultCode {

    // 未知的系统错误
    UNKNOWN_ERROR("1", "未知的系统错误"),
    // 各类异常响应码
    DB_ERROR("1", SYS, "数据库异常"),
    CACHE_ERROR("2", SYS, "缓存异常"),
    HTTP_ERROR("3", SYS, "调用HTTP接口发生异常"),
    RETURN_NULL_ERROR("4", SYS, "服务不能返回空对象");

    /**
     * 响应码
     */
    private final String code;

    /**
     * 响应消息
     */
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 构造函数
     *
     * @param code 响应码
     * @param codeSign 响应码标识
     * @param message 消息
     */
    ErrorCode(String code, String codeSign, String message) {
        this.code = codeSign + "_" + code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}