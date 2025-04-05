package com.practice.numbers;

import java.util.Arrays;

public class LastElementFromAnArray {
    public static void main(String[] args) {
        int [] inputArray =  {1,3,4,5,6,42,22};

       int lastElement = inputArray[inputArray.length-1];
       System.out.println(Arrays.stream(inputArray).skip(inputArray.length-1).findFirst().getAsInt());
        System.out.println(lastElement);
    }
}
