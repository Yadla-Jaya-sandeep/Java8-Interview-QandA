package com.practice.stringquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInaString {
    static String reverseEachWordInString(String s) {
        String reversedString = "";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                reversedString += reverseWord(word) + " ";
                word = "";
            } else {
                word += c;
            }
        }
        reversedString += reverseWord(word); // append the last word
        return reversedString;
    }
    static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    static String reverseString(String s){

        return Arrays.stream(s.split(" "))
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        String S="sandeep is a good boy";
        System.out.println(reverseEachWordInString(S));
        System.out.println(reverseString(S));
        System.out.println();
    }
}
