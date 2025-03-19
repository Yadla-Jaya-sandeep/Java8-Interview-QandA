package com.practice.java8.numbers;

import java.util.List;
import java.util.stream.Collectors;

public class SeprateOddAndEvenNumbers {
    static void printOddAndEvenNumbers(List<Integer> list) {
        list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .forEach((k, v) -> {
                    if (k) {
                        System.out.println("Even numbers :");
                        System.out.println(v);
                    } else {
                        System.out.println("Odd numbers :");
                        System.out.println(v);
                    }
                });
        list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .entrySet().stream().forEach(es -> {
                    System.out.println(es.getKey() ? "Even :" : "Odd :");
                    System.out.println(es.getValue());
                });
    }

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printOddAndEvenNumbers(list);
    }
}
