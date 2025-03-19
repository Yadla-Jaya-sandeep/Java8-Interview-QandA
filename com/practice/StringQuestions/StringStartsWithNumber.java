package com.practice.StringQuestions;

import java.util.function.Predicate;

public class StringStartsWithNumber {

    public static void main(String[] args) {
        String input = "1Hello";

       Boolean isStartWithNum =  checkStartsWithNum(input);

       if(Boolean.TRUE.equals(isStartWithNum)) {
           System.out.println("Given string starts with number");
       }
    }

    private static Boolean checkStartsWithNum(String input) {

        Predicate<String> startsWithNum =
                s -> !s.isEmpty() && Character.isDigit(s.charAt(0));
        return startsWithNum.test(input);


/*      //Another approach
       return input.startsWith("^[0-9].*");
 */


    }
}
