package com.practice.StringQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
        String input1 = "Listen";
        String input2 = "Silent";
       Boolean isAnagram =  checkAnagram(input1,input2);

       if(isAnagram) {
           System.out.printf("Anagram");
       }
       else {
           System.out.println("Not Anagram");
       }
    }

    /**
     Efficient Approach
     */

    private static Boolean checkAnagramWithSort(String input1, String input2) {
       return Arrays.stream(input1.split(""))// converting to stream of character
               .sorted()
               .collect(Collectors.joining()) // Joining back with string
               .equals(Arrays.stream(input2.split("")).sorted()
                       .collect(Collectors.joining()));
    }

    private static Boolean checkAnagram(String input1, String input2) {
        LinkedHashMap<Character, Long> collect = input1.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        LinkedHashMap<Character, Long> collect1 = input2.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        return collect1.equals(collect);
    }
}
