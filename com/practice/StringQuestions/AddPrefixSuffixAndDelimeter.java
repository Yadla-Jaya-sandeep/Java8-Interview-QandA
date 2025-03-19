package com.practice.StringQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class AddPrefixSuffixAndDelimeter {
    public static void main(String[] args) {
        List<String>  inputList = List.of("Apple","Banana","Mango");
       String finalString =  addPrefixSufixAndDelimeter(inputList);
       if(null!= finalString) {
           System.out.println(finalString);
       }
    }

    private static String addPrefixSufixAndDelimeter(List<String> inputList) {
       return inputList.stream()
                .collect(Collectors.joining(",","[","]"));

    }
}
