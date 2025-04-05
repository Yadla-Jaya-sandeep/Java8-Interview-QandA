package com.practice.stringquestions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findAllUniqueSubString {
    public static void main(String[] args) {
        String input = "abc";
        Set uniqueString = findUniqueString(input);
        if(null != uniqueString) {
            System.out.printf(uniqueString.toString());
        }
    }

    private static Set findUniqueString(String input) {
        return IntStream.range(0, input.length())
                .boxed()
                .flatMap(start ->
                        IntStream.range(start +1, input.length()+1)
                                .mapToObj(end -> input.substring(start,end)))
                .collect(Collectors.toSet());
    }
}

