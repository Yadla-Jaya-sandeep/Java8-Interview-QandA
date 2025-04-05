package com.practice.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestAndSmallestString {
    static String findLongestString(List<String> list) {
        return list.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
    }
    static String findSmallestString(List<String> list) {
        return list.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);
    }
    public static void main(String[] args) {
     var list= List.of("apple", "cat", "dog", "elephant");
     var list1= Arrays.asList("sandeep", "vamsi", "yashayaa");
        System.out.println(findLongestString(list));
        System.out.println(findSmallestString(list));
        System.out.println(findLongestString(list1));
        System.out.println(findSmallestString(list1));

    }
}
