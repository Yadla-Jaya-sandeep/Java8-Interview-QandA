package com.practice.stringquestions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInList {
    static void printCountOfEachString(List<String> list) {
        list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        printCountOfEachString(stationeryList);
    }
}
