package com.mervyn.nephs.base.config;

import com.mervyn.nephs.base.utils.NephsSnowFlake;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 2hen9ao
 * @date 2023/9/7 15:31
 */
@Component
public class SnowflakeConfig {

    @Bean
    public NephsSnowFlake nephsSnowFlake(){
        return new NephsSnowFlake();
    }


}
