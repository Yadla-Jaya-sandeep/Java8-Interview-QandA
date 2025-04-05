package com.practice.arraysquestions;

import java.util.*;

public class SecondHighestAndLowest {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 12, 34);


        //secondHighest
        integerList.sort(Comparator.reverseOrder());
        Optional<Integer> highest = integerList.stream().skip(1).findFirst();
        System.out.println(highest);

        //secondLowest
        Collections.reverse(integerList);
        Optional<Integer> secondLowest = integerList.stream().skip(1).findFirst();
        System.out.println(secondLowest);
    }
}
