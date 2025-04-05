package com.practice.string;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {
    static Boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return Boolean.FALSE;
        }
        var s= a.chars().boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        var v= b.chars().boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        System.out.println(s);
        System.out.println(v);
        return s.equals(v);
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("listen","silent"));
        System.out.println(checkAnagram("sandeep","peednas"));

    }
}
