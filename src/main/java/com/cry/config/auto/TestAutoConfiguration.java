package com.cry.config.auto;

import com.cry.service.UtilService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAutoConfiguration {
    @Bean
    UtilService utilServiceAware(){
        return new UtilService();
    }
}
