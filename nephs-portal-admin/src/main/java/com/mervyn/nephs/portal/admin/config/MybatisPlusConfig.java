package com.mervyn.nephs.portal.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 2hen9ao
 * @date 2023/9/7 11:33
 */
@Configuration
@MapperScan("com.mervyn.nephs.*.mapper")
public class MybatisPlusConfig {


}
