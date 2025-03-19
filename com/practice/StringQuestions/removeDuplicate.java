package com.practice.StringQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicate {

    public static void main(String[] args) {
        String input = "Programming";
        String replacedString = removeDuplicate(input);
        System.out.printf(replacedString);
    }

    private static String removeDuplicate(String input) {

        Set<Character> seen = new HashSet<>();

        return input.chars().mapToObj(c -> (char) c)
                .filter(seen::add)
                .map(String::valueOf)
                .collect(Collectors.joining());

//        List<Character> collect = input.chars().mapToObj(value -> (char) value)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(value -> value.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        return collect.stream().filter(seen::add).map(String::valueOf).collect(Collectors.joining());
    }
}

