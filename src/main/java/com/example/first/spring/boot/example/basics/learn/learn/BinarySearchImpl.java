package com.example.first.spring.boot.example.basics.learn.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearchImpl {
    //1. sort array
    //2. search array
    //3. return the result

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int search(int[] numbers, int numberToSearchFor) {
//        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
//        int[] sortedNumbers = sortArray(numbers);
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        System.out.println(Arrays.toString(sortedNumbers));
        if (sortedNumbers.length>1) {
            int low = 0;
            int high = sortedNumbers.length-1;
            return doSearch(sortedNumbers, numberToSearchFor, low, high);
        }
        return -1;
    }
    private int doSearch(int[] sortedNumbers, int numberToSearchFor, int low, int high) {
        if (high>=low) {
            int mid = low + (high-low) / 2;
            if (sortedNumbers[mid]==numberToSearchFor) {
                return mid;
            }
            if (sortedNumbers[mid]>numberToSearchFor) {
                return doSearch(sortedNumbers, numberToSearchFor, low, mid-1);
            }
            return doSearch(sortedNumbers, numberToSearchFor, mid+1, high);
        }
        return -1;
    }
}
