package org.zhubao.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.zhubao.mapper")
public class MybatisConfig {

}