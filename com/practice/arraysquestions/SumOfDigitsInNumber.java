package com.practice.arraysquestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        Integer i=123456789;
       System.out.println(Stream.of(String.valueOf(i).
               split("")).collect(Collectors.summingInt(Integer::parseInt)));
        System.out.println(Arrays.stream(String.valueOf(i).
                split("")).collect(Collectors.summingInt(Integer::parseInt)));
    }
}
