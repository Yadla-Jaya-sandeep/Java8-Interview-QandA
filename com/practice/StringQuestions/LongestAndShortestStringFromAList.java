package com.practice.StringQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestAndShortestStringFromAList {

    public static void main(String[] args) {
        List<String> inputList = List.of("Hello","World","Welcome","Programming");
       String longestString =  findLongestString(inputList);
        System.out.println(longestString);
    }

    private static String findLongestString(List<String> inputList) {
        Optional<String> max = inputList.stream().max(Comparator.comparingInt(String::length));
        return max.orElse(null);
    }
}
