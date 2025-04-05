package com.practice.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstTotalMaxElement {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1,2,3,4,566,78,9,10);
        Optional<Integer> first = inputList.stream().findFirst();
        System.out.println("First :" + first);
        inputList.sort(Comparator.reverseOrder());


        Integer max =  inputList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max :" + max);

        long count = inputList.stream().collect(Collectors.counting());
        System.out.println("Total :" +  count);

        // inputList.stream().max(Comparator.comparingInt())
    }
}
