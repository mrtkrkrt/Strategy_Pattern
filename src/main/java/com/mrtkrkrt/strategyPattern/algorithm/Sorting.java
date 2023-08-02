package com.mrtkrkrt.strategyPattern.algorithm;

import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;

import java.util.List;

public interface Sorting {
    public void sort(List<Integer> list);
    public SortAlgorithmEnum getAlgorithmType();
}
