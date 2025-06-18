package com.beanlife;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeConfig.class);

        // Retrieve bean to trigger lifecycle
        LifecycleBean bean = context.getBean(LifecycleBean.class);

        // Close context to trigger destroy lifecycle
        context.close();
    }
}