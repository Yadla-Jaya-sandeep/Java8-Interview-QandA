package com.practice.stringquestions;

import java.util.*;

public class FindFirstRepeatedCharacters {

    public static void main(String[] args) {
        String input = "swiss";
        Character repeatedCharacter = findRepeatedCharacter(input);

        if(null != repeatedCharacter) {
            System.out.println("First repeated character is: " + repeatedCharacter);
        }
        else {
            System.out.println("there is no repeated characters");
        }

    }

    private static Character findRepeatedCharacter(String input) {

        Set<Character> seen = new HashSet<>();

        return input.toLowerCase().chars() //Convert string to int stream
                .mapToObj(c -> (char) c) // convert int stream to characters
                .filter(value -> !seen.add(value)) // check if character is already seen
                .findFirst()
                .orElse(null);

        /*
        Another approach using frequency map
         */

//      return  input.toLowerCase()
//                .chars() // convert string to int stream
//                .mapToObj(c -> (char) c) // Convert int stream to char
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(value -> value.getValue() != 1)
//                .map(Map.Entry::getKey)
//                .findFirst()
//                .orElse(null);

    }
}

