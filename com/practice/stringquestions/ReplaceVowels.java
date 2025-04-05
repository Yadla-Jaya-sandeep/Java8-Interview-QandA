package com.practice.stringquestions;

import java.util.stream.Collectors;

public class ReplaceVowels {

    public static void main(String[] args) {
        String input = "The quick brown fox and dog jumped over the lazy dog";

        String vdf = input.chars()
                .mapToObj(value -> (char) value)
                .map(String::valueOf)
                .filter(value -> !"AEIOUaeiou".contains(value))
                .collect(Collectors.joining());

        System.out.println(vdf);
    }
}
