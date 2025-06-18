package com.beanscope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor: LifecycleBean instance created");
    }

    public void showHash() {
        System.out.println("Bean hashCode: " + this.hashCode());
    }
}