package com.mrtkrkrt.strategyPattern.algorithm;

import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MergeSort implements Sorting{
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Using Merge Sort Algorithm");
    }

    @Override
    public SortAlgorithmEnum getAlgorithmType() {
        return SortAlgorithmEnum.MERGE_SORT;
    }
}
