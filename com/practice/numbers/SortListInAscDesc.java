package com.practice.numbers;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListInAscDesc {
    public static void main(String[] args) {
        List<Integer> inputList =  Arrays.asList(2, 3, 4, 5, 67, 8, 9, 8,10, 11, 12);
        List<Integer> inputList2 =  Arrays.asList(2, 3, 4, 5, 67, 8, 9, 8,10, 11, 12);
        Collections.sort(inputList);
        inputList2.sort(Comparator.reverseOrder());
       inputList.forEach(System.out::println);
       inputList2.forEach(System.out::println);

    }


}
