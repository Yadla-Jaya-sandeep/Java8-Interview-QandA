package com.practice.stringquestions;

import java.util.List;
import java.util.stream.Collectors;

public class  ConcatThelistOfStringsWithDelimiter{
    static String concatThelistOfStrings(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(",", "[", "]"));
    }
    public static void main(String[] args) {
        var list= List.of("apple", "cat", "dog", "elephant");
        System.out.println(concatThelistOfStrings(list));
    }
}
