package com.springdi.sorting;

public class SortService {
    private final ISort sortAlgorithm;

    public SortService(ISort sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void performSort(int[] numbers) {
        sortAlgorithm.sort(numbers);
    }
}