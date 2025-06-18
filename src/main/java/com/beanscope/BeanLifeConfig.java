package com.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanLifeConfig {

    @Bean
    @Scope("singleton")
    public LifecycleBean singletonBean() {
        return new LifecycleBean();
    }

    @Bean
    @Scope("prototype")
    public LifecycleBean prototypeBean() {
        return new LifecycleBean();
    }
}