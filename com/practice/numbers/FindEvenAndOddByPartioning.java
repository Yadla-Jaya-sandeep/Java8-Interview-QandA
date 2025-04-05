package com.practice.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenAndOddByPartioning {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 8,10, 11, 12);
        Map<Boolean, List<Integer>> booleanListMap =
                integerList.stream().collect(Collectors.partitioningBy(value -> value % 2 == 0));
        if(null != booleanListMap) {
            System.out.println(booleanListMap.get(true));
            System.out.println(booleanListMap.get(false));
        }

    }
}
