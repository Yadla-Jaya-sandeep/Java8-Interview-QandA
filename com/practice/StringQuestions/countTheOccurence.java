package com.practice.StringQuestions;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countTheOccurence {

    public static void main(String[] args) {
        String input = "Programming";

        LinkedHashMap<Character, Long> collect = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().stream().forEach(System.out::println);

    }
}
