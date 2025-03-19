package com.practice.java8.string;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    static void printCharFrequency(String s) {
        s.chars()
                .mapToObj(value -> (char) value)
                .filter(c -> !c.equals(' '))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).forEach((k, v) ->
                        System.out.println(k + "=" + v));

    }

    public static void main(String[] args) {
        printCharFrequency("CHECK THIS STRING");
    }
}
