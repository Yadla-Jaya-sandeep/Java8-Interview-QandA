package com.practice.numbers;

import java.util.Arrays;
import java.util.List;

public class ProductOfElementInList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 12, 34);
        System.out.println(integerList.stream().reduce((s1,s2) -> s1*s2));
    }
}
