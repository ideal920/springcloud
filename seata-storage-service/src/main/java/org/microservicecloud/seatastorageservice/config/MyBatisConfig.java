package org.microservicecloud.seatastorageservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan({"org.microservicecloud.seatastorageservice.dao"})
public class MyBatisConfig {
}
