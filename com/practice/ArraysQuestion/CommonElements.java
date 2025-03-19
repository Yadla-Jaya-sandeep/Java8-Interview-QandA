package com.practice.ArraysQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integerList1 = Arrays.asList(1, 4, 5);

        List<Integer> collected =
                integerList.stream()
                        .filter(integerList1::contains)
                        .collect(Collectors.toList());
        collected.forEach(System.out::println);

    }
}
