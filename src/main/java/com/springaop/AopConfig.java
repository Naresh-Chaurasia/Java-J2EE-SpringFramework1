package com.springaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// "Hey Spring, please look for any classes marked with @Aspect and apply their advice (like logging, security checks, etc.) automatically when the matching methods run."
@Configuration
@ComponentScan(basePackages = "com.springaop")
@EnableAspectJAutoProxy
public class AopConfig {
}