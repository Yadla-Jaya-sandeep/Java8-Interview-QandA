package com.practice.stringquestions;

import java.util.List;
import java.util.stream.Collectors;

public class StringToListOfCharacters {

    public static void main(String[] args) {
        String input = "The quick brown fox and dog jumped over the lazy dog";

        List<Character> collect = input.chars()
                .mapToObj(value -> (char) value)
                .filter(value -> value != ' ')
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
