package com.practice.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class MaxAndMinOfList {
    public static void main(String[] args) {
        var listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println(listOfIntegers.stream().max(Comparator.naturalOrder()).get());
        System.out.println(listOfIntegers.stream().min(Comparator.naturalOrder()).get());
        IntSummaryStatistics stats=listOfIntegers.stream().collect(Collectors.summarizingInt(i->i));
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
    }
}
