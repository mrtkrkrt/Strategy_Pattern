package com.mrtkrkrt.strategyPattern.algorithm;

import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinarySort implements Sorting{

    @Override
    public void sort(List<Integer> list) {
        System.out.println("Using Binary Sort Algorithm");
    }

    @Override
    public SortAlgorithmEnum getAlgorithmType() {
        return SortAlgorithmEnum.BINARY_SORT;
    }
}
