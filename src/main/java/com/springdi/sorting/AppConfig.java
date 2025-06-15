package com.springdi.sorting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ISort bubbleSort() {
        return new BubbleSort();
    }

    @Bean
    public SortService sortService(ISort sortAlgorithm) {
        return new SortService(sortAlgorithm);
    }
}