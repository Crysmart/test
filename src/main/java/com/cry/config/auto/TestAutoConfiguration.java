package com.cry.config.auto;

import com.cry.service.TestUtil;
import com.cry.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestUtil.class)
@ConditionalOnProperty(prefix = "test",value = "enabled",matchIfMissing = true)
public class TestAutoConfiguration {

    @Autowired
    TestUtil testUtil;
    
    @Bean
    UtilService utilServiceAware(){
        UtilService utilService = new UtilService();
        utilService.setTestUtil(testUtil);
        return utilService;
    }
}
