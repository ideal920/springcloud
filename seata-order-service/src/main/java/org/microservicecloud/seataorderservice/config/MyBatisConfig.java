package org.microservicecloud.seataorderservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan({"org.microservicecloud.seataorderservice.dao"})
public class MyBatisConfig {
}
