package com.springaop;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {
    public void serve() {
        System.out.println("Service method executed.");
    }
}
