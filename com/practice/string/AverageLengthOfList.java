package com.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageLengthOfList {
    static Double avgOfArray(List<String> arr) {
        return arr.stream().mapToDouble(String::length).average().orElse(0);
    }
    static Double avgOfArray1(List<String> arr) {
        return arr.stream().collect(Collectors.averagingDouble(String::length));
    }
    public static void main(String[] args) {
        var list= Arrays.asList("sandeep", "vamsi", "yashu");
        System.out.println(avgOfArray(list));
    }
}
