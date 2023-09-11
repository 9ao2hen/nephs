package com.mervyn.nephs.common.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author 2hen9ao
 * @date 2023/9/8 20:39
 */
public enum GenderEnum {

    UNKNOWN(0, "未知"),
    MALE(1, "男"),
    FEMALE(2, "女"),
    SECRECY(9, "保密"),
    ;

    final int code;
    final String name;

    GenderEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getByCode(int code) {
        return Arrays.stream(GenderEnum.values())
                .filter(em -> em.getCode() == code)
                .findAny()
                .orElse(GenderEnum.UNKNOWN).getName();
    }

    public static int getByName(String name) {
        return Arrays.stream(GenderEnum.values())
                .filter(em -> StringUtils.equals(em.getName(), name))
                .findAny()
                .orElse(GenderEnum.UNKNOWN).getCode();
    }
}
