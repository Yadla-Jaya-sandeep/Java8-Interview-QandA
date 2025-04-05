package com.practice.stringquestions;

import java.util.List;
import java.util.stream.Collectors;

public class findDistinctCharacters {

    public static void main(String[] args) {
        String input = "Student";
        List<String> input2 = List.of("Apple","Mango","Banana","Apple");
        List<Character> distinctChars = findDistinctChars(input);
        List<String> distinctWord = findDistinctString(input2);
        if(!distinctChars.isEmpty()) {
            distinctChars.forEach(value -> {
                System.out.println(value);
            });
        }
        if(!distinctWord.isEmpty()) {
            distinctWord.forEach(value -> {
                System.out.println(value);
            });
        }
    }

    private static List<Character> findDistinctChars(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .distinct().collect(Collectors.toList());
    }

    private static List<String> findDistinctString(List<String> input2) {
       return input2.stream().distinct().collect(Collectors.toList());
    }
}
