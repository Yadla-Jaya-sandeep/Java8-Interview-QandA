package com.practice.stringquestions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveEvenCharacterFromString {
    public static void main(String[] args) {
        String input = "Welcome to java";

        String collect = IntStream.range(0, input.length() - 1)
                .filter(value -> value % 2 == 0 && input.charAt(value) != ' ')
                .mapToObj(i -> String.valueOf(input.charAt(i)))
                .collect(Collectors.joining());
             System.out.println(collect);
    }
}
