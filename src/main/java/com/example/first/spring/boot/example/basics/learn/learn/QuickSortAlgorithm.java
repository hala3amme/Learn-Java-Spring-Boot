package com.example.first.spring.boot.example.basics.learn.learn;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
