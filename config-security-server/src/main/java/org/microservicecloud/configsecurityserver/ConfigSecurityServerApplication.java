package org.microservicecloud.configsecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer //启用配置中心服务端
@SpringBootApplication
public class ConfigSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSecurityServerApplication.class, args);
    }

}
