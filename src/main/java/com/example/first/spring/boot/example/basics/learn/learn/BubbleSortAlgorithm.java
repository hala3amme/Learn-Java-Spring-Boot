package com.example.first.spring.boot.example.basics.learn.learn;

import java.util.Arrays;


public class BubbleSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
