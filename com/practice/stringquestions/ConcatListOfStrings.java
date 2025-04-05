package com.practice.stringquestions;

import java.util.List;
import java.util.stream.Collectors;

public class ConcatListOfStrings {
    static String concatThelistOfStrings(List<String> list) {
        return list.stream()
                .reduce("", (a, b) -> a +" "+ b);
    }
    static String concatThelistOfStrings1(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        var list= List.of("apple", "cat", "dog", "elephant");
        System.out.println(concatThelistOfStrings(list));
        System.out.println(concatThelistOfStrings1(list));
    }
}
