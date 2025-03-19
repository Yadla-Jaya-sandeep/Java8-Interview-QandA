package com.practice.java8.string;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramOrNot {
    static Boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return Boolean.FALSE;
        }
        var s = a.chars().boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        var v = b.chars().boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        System.out.println(s);
        System.out.println(v);
        return s.equals(v);
    }

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }
}
