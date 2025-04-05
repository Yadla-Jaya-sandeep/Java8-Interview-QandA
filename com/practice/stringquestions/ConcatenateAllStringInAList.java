package com.practice.stringquestions;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateAllStringInAList {

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello", "World", "Java");
        String concatenatedList = concatenateAllString(stringList);
        System.out.println(concatenatedList);
    }

    private static String concatenateAllString(List<String> inputList) {

        return inputList.stream().collect(Collectors.joining());
    }
}
