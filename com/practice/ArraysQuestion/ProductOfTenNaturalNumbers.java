package com.practice.ArraysQuestion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfTenNaturalNumbers {

    public static void main(String[] args) {

        Map<Boolean, List<Integer>> booleanListMap = IntStream.range(1, 100).boxed().limit(10)
                .collect(Collectors.partitioningBy(value -> value % 2 == 0));
        //.reduce((first, second) -> first * second);

        booleanListMap.entrySet().forEach(value -> {
            System.out.printf(value.getKey() + " " + value.getValue());
        });
    }
}
