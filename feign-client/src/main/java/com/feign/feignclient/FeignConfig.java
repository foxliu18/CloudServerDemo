package com.feign.feignclient;

import feign.Retryer;
import org.springframework.context.annotation.Bean;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FeignConfig {
    @Bean
    public Retryer feignReteyer(){
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
