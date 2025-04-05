package com.practice.stringquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeStringToTitle {
    public static void main(String[] args) {
        String input = "The quick brown fox and dog jumped over the lazy dog";
        //convert string into title
        String collect = Arrays.stream(input.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.printf(collect);

    }
}
