package com.practice.stringquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementsInAList {
    public static void main(String[] args) {
        List<String> stringList = List.of("Hp", "Lenovo", "Dell", "Hp");
        List<String> duplicateElement = getDuplicateElement(stringList);
        duplicateElement.forEach(System.out::println);
    }

    private static List<String> getDuplicateElement(List<String> stringList) {
        return stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
