package com.mrtkrkrt.strategyPattern.controller;

import com.mrtkrkrt.strategyPattern.enums.SortAlgorithmEnum;
import com.mrtkrkrt.strategyPattern.factory.SortingFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
public class StrategyController {

    @Autowired
    public SortingFactory sortingFactory;

    @GetMapping("/strategy")
    public void sort(@RequestParam SortAlgorithmEnum sortAlgorithmEnum) {
        sortingFactory.findSortingType(sortAlgorithmEnum).sort(new ArrayList<>());
    }
}
