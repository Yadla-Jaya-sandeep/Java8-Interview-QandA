package com.practice.StringQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Yellow is a color";
        String reversed = reverseEachWord(input);
        //String reversed =  reverseWordSequence(input);
        if (null != reversed) {
            System.out.println("Reversed string : " + reversed);
        } else {
            System.out.printf("no string found");
        }

    }

    private static String reverseEachWord(String input) {

        if (null != input) {
            return Arrays.stream(input.split("\\s+")) //Split the words with multiple spaces
                    .map(word -> new StringBuilder(word).reverse().toString()) // reverse each word
                    .collect(Collectors.joining(" ")); // join back with spaces
        }
        return null;
    }

    private static String reverseWordSequence(String input) {

        List<String> stringList = Arrays.asList(input.split("\\s+"));
        Collections.reverse(stringList); //Reverse the list order
        return stringList.stream().collect(Collectors.joining(" "));
    }
}
