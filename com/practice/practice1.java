package com.practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice1 {
    static char firstRepeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c->c!=' ')
                .filter(c -> !set.add(c))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No repeated character found"));
    }
    static char firstNonRepeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c->c!=' ')
                .filter(c -> set.add(c))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non repeated character found"));
    }
    static char firstRepeatedCharacter1(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No repeated character found"));
    }

    static char firstNonRepeatedCharacter1(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeated character found"));
    }
    static char firstRepeatedCharacter2(String s) {
        Map<Character, Long> charCountMap = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No repeated character found"));
    }

    static char firstNonRepeatedCharacter2(String s) {
        Map<Character, Long> charCountMap = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeated character found"));
    }
    public static void main(String[] args) {
        String s = "sa nd eep";
        System.out.println("First repeated character: " + firstRepeatedCharacter(s));
        System.out.println("First NON repeated character: " + firstNonRepeatedCharacter(s));
        System.out.println("First repeated character: " + firstRepeatedCharacter1(s));
        System.out.println("First NON repeated character: " + firstNonRepeatedCharacter1(s));
        System.out.println("First repeated character: " + firstRepeatedCharacter2(s));
        System.out.println("First NON repeated character: " + firstNonRepeatedCharacter2(s));
    }
}