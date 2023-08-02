package com.mrtkrkrt.strategyPattern.algorithm;

import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuickSort implements Sorting{
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Using Quick Sort Algorithm");
    }

    @Override
    public SortAlgorithmEnum getAlgorithmType() {
        return SortAlgorithmEnum.QUICK_SORT;
    }
}
