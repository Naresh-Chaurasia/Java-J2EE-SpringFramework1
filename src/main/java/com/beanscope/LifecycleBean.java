package com.beanscope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor: LifecycleBean instance created");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: init method called");
    }

    public void customInit() {
        System.out.println("customInit(): custom init method called");
    }

    public void customDestroy() {
        System.out.println("customDestroy(): custom destroy method called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy: preDestroy method called");
    }

    public void showHash() {
        System.out.println("Bean hashCode: " + this.hashCode());
    }
}