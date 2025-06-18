package com.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanLifeConfig.class);

        System.out.println("Singleton scope:");
        LifecycleBean singleton1 = context.getBean("singletonBean", LifecycleBean.class);
        LifecycleBean singleton2 = context.getBean("singletonBean", LifecycleBean.class);
        singleton1.showHash();
        singleton2.showHash();

        System.out.println("\nPrototype scope:");
        LifecycleBean prototype1 = context.getBean("prototypeBean", LifecycleBean.class);
        LifecycleBean prototype2 = context.getBean("prototypeBean", LifecycleBean.class);
        prototype1.showHash();
        prototype2.showHash();

        context.close();
    }
}
