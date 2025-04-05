package com.practice.string;

import java.util.List;

public class FindFirstWordStartWithLetter {
    static String  firstWordWithGivenLetter(List<String> list)
    {
        return list.stream().filter(e->e.startsWith("e")).findFirst().orElseThrow(()->new RuntimeException("No String found"));
    }
    public static void main(String[] args) {
        var list= List.of("apple", "cat", "dog", "elephant");
        System.out.println(firstWordWithGivenLetter(list));
    }
}
