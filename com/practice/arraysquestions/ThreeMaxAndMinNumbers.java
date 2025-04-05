package com.practice.arraysquestions;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
//        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        System.out.println(listOfIntegers.stream().collect(Collectors.summarizingInt(value -> value)));
        IntSummaryStatistics stats=listOfIntegers.stream().collect(Collectors.summarizingInt(value -> value));
        System.err.println(stats.getMax());

    }
}
