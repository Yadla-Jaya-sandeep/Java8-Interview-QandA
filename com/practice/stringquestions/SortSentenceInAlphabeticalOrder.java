package com.practice.stringquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortSentenceInAlphabeticalOrder {

    public static void main(String[] args) {

        String input = "The quick brown fox and dog jumped over the lazy dog";

        String collect = Arrays.stream(input.split(" "))
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.joining(" "));

        System.out.println(collect);

    }
}
