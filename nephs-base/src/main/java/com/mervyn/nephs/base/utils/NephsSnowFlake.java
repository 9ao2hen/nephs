package com.mervyn.nephs.base.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author 2hen9ao
 * @date 2023/9/7 15:53
 */
public class NephsSnowFlake {

    private final Snowflake snowflake;

    public NephsSnowFlake() {
        snowflake = IdUtil.getSnowflake(1, 1);
    }

    public Long generateId(){
        return snowflake.nextId();
    }
}
