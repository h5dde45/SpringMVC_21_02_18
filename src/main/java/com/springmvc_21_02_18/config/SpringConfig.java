package com.springmvc_21_02_18.config;

import com.springmvc_21_02_18.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public TestBean getTestBean() {
        return new TestBean("3445");
    }
}
