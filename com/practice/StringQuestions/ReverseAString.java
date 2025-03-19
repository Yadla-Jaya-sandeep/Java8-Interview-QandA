package com.practice.StringQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "Dummy";
        List<String> dumm = new ArrayList<>(List.of("dumm", "game", "programming"));
        Collections.reverse(dumm);
        String reversedString = reverseString(input);
        System.out.println(reversedString);
        System.out.println(dumm);
    }


    private static String reverseString(String input) {
      return new StringBuilder(input).reverse().toString();
    }

}
