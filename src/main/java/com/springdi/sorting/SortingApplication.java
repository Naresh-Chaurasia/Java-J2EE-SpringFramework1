package com.springdi.sorting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SortingApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SortService sortService = context.getBean(SortService.class);
        int[] numbers = { 5, 3, 8, 4, 2 };
        sortService.performSort(numbers);
    }
}