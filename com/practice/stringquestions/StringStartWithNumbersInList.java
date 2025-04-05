package com.practice.stringquestions;

import java.util.List;
import java.util.Objects;

public class StringStartWithNumbersInList {
    static List<String> getListStartWithNumbers(List<String> list) {
        var s=list.stream()
                .filter(Objects::nonNull)
                .filter(e->Character.isDigit(e.charAt(0)))
                .toList();
        return s;
    }
    static  List<String> getListStartWithNumbers1(List<String> list) {
        var s=list.stream()
                .filter(Objects::nonNull)
                .filter(e->e.charAt(0)>=48&&e.charAt(0)<=57)
                .toList();
        return s;
    }

    public static void main(String[] args) {
        var list = List.of("apple", "cat", "3dog", "4elephant");
        System.out.println(getListStartWithNumbers(list));
        System.out.println(getListStartWithNumbers1(list));
    }
}
