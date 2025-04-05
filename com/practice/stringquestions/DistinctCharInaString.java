package com.practice.stringquestions;

import java.util.stream.Collectors;

public class DistinctCharInaString {
    static String findDistinctCharacter(String s) {
        return s.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        var string="sandeep";
        System.out.println(findDistinctCharacter(string));
    }
}
