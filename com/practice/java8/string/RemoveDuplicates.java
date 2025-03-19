package com.practice.java8.string;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        var listOfStrings = List.of("Java", "Python", "C#", "Java", "Kotlin", "Python");

        var uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
        var set = new HashSet<String>();
        listOfStrings.stream().filter(s -> set.add(s)).forEach(System.out::println);

        System.out.println(uniqueStrngs);
    }
}
