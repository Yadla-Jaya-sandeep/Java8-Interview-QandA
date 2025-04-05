package com.practice.arraysquestions;

import java.util.Arrays;
import java.util.List;

public class LastElementFromList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 12, 34);

        Integer integer = integerList.get(integerList.size() - 1);
        System.out.println(integer);

//        not optimal
//        Integer integer = integerList.stream().reduce((first, second) -> second).orElse(null);
//        System.out.println(integer);
    }
}
