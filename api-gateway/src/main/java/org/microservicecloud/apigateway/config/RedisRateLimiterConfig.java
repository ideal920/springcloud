package org.microservicecloud.apigateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * Created by wyc on 2019/9/25.
 */
@Configuration
public class RedisRateLimiterConfig {
//    @Bean
//    KeyResolver userKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("username"));
//    }

    @Bean
    public KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
