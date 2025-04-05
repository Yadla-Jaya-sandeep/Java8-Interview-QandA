package com.practice.stringquestions;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckDuplicateCharacter {

    public static void main(String[] args) {
        String input = "Programming";
       Boolean isDuplicateChar =  checkDuplicateCharPresent(input);
       if(isDuplicateChar) {
           System.out.printf("duplicate is present");
       }
    }

    private static Boolean checkDuplicateCharPresent(String input) {

        Optional<Map.Entry<Character, Long>> first = input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(value -> value.getValue() > 1)
                .findFirst();
        return first.isPresent();
    }
}
