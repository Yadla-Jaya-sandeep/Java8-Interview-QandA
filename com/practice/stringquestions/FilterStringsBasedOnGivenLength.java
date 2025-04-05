package com.practice.stringquestions;

import java.util.List;

public class FilterStringsBasedOnGivenLength {
    static void printAllStringsOfGivenLength(List<String> list)
    {
        list.stream().filter(e->e.length()==5).forEach(System.out::println);
    }

    public static void main(String[] args) {
        var list= List.of("Sandeep","nani","kiduh","vema","potti","yashu");
        printAllStringsOfGivenLength(list);
    }
}
