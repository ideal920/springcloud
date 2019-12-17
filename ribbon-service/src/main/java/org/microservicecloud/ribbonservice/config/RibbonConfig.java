package org.microservicecloud.ribbonservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wyc on 2019/12/12.
 */
@Configuration
public class RibbonConfig {

    /**
     * @LoadBalanced 赋予RestTemplate负载均衡的能力
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
