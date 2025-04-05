package com.practice.stringquestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacters {

    public static void main(String[] args) {
        String input = "Hello World";
        Character nonRepeatedCharacter = findFirstNonRepeatedCharacter(input);

        if(null != nonRepeatedCharacter) {
            System.out.println("First non repeated character is: " + nonRepeatedCharacter);
        }
        else {
            System.out.println("there is no repeated characters");
        }

    }

    private static Character findFirstNonRepeatedCharacter(String input) {
        return input.toLowerCase().chars() //Convert string to int stream
                .mapToObj(c -> (char) c) // convert int stream to characters
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))  // creates a frequency map
                .entrySet().stream()
                .filter(value -> value.getValue() == 1)  //find first non repeated character
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);

    }
}
