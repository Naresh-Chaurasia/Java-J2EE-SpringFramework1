package com.beanlife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@PreDestroy uses annotation, while destroyMethod uses explicit configuration.
@Configuration
public class BeanLifeConfig {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public LifecycleBean lifecycleBean() {
        return new LifecycleBean();
    }
}