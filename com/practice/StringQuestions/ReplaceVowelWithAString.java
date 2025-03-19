package com.practice.StringQuestions;

public class ReplaceVowelWithAString {

    public static void main(String[] args) {
        String input = "programming";
        Character inputChar = 'e';

        String replacedString = replaceVowel(input, inputChar);
        System.out.printf(replacedString);
    }

    private static String replaceVowel(String input, Character inputChar) {
        return input.replaceAll("(?i)[aieou]", String.valueOf(inputChar));
    }
}
