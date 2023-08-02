package com.mrtkrkrt.strategyPattern.factory;

import com.mrtkrkrt.strategyPattern.algorithm.Sorting;
import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class SortingFactory {

    Map<SortAlgorithmEnum, Sorting> sortAlgorithmEnumSortingMap;

    @Autowired
    public SortingFactory(Set<Sorting> sortingSet) {
        createSorting(sortingSet);
    }

    private void createSorting(Set<Sorting> sortingSet) {
        sortAlgorithmEnumSortingMap = new HashMap<>();
        sortingSet.stream().forEach(sort -> sortAlgorithmEnumSortingMap.put(sort.getAlgorithmType(), sort));
    }

    public Sorting findSortingType(SortAlgorithmEnum sortAlgorithmEnum) {
        return sortAlgorithmEnumSortingMap.get(sortAlgorithmEnum);
    }
}
