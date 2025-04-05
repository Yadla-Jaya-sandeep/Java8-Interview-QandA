package com.practice.stringquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {


    public static void main(String[] args) {
        String input = "The quick brown fox and dog jumped dog over fox the lazy dog";

        //most frequent word
        Map.Entry<String, Long> stringLongEntry = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get();

        System.out.println(stringLongEntry);

    }


}
