package com.practice.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeUnSortedArray {


    public static void main(String[] args) {
        List<Integer> inputList1 = Arrays.asList(1,4,6,8,5,4,6,7);
        List<Integer> inputList2 = Arrays.asList(2,5,0,9,11,01,100);
        List<Integer> finalList = new ArrayList<>();

        finalList.addAll(inputList1);
        finalList.addAll(inputList2);

        Collections.sort(finalList);

        finalList.forEach(System.out::println);
       System.out.println(Stream.concat(inputList1.stream(),inputList2.stream()).distinct().sorted().collect(Collectors.toList()));

    }


}
