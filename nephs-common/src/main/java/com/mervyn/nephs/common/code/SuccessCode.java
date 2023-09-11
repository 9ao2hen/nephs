package com.mervyn.nephs.common.code;

public enum SuccessCode implements ResultCode {

    /**
     * 成功返回的编码
     */
    SUCCESS("0", "成功!");

    /**
     * 响应码
     */
    private final String code;

    /**
     * 响应消息
     */
    private final String message;

    /**
     * 构造函数
     *
     * @param code 响应码
     * @param message 消息
     */
    SuccessCode(String code, String message) {
        this.code = code;
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
