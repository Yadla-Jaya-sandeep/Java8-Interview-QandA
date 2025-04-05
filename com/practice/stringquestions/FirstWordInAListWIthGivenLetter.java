package com.practice.stringquestions;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FirstWordInAListWIthGivenLetter {

    public static void main(String[] args) {
        List<String> stringList = List.of("Java", "program", "moderate");
        Character startsWith = 'P';
        List<String> wordStartWithGivenChar = findWordStartWithGivenChar(stringList, startsWith);
        if(!wordStartWithGivenChar.isEmpty()) {
            wordStartWithGivenChar.forEach(System.out::println);
        }
    }

    private static List<String> findWordStartWithGivenChar(List<String> inputList, Character startsWith) {
       return inputList
                .stream()
                .map(String::toLowerCase)
                .filter(Objects::nonNull)
                .filter(value -> value.startsWith(startsWith.toString().toLowerCase())).collect(Collectors.toList());

    }
}
