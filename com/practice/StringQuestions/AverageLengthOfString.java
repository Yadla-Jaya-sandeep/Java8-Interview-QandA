package com.practice.StringQuestions;

import java.util.List;

public class AverageLengthOfString {

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Hello", "World", "Java");
        int averageLength = findAverageLength(stringList);
        System.out.printf("average: " + averageLength);
    }

    private static int findAverageLength(List<String> stringList) {
        return stringList.stream().mapToInt(String::length).sum() / stringList.size();
    }
}
