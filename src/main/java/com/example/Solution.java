package com.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                list.add("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(matcher(i));
        }
        return list;
    }

    private String matcher(int i) {
        String iString = String.valueOf(i);
        boolean fizz = ((i%3==0)||iString.contains("3"));
        boolean buzz = ((i%5==0)||iString.contains("5"));
        if(fizz&&buzz){
            return "FizzBuzz";
        }else if(fizz){
            return "Fizz";
        }else if(buzz){
            return "Buzz";
        }else {
            return iString;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.fizzBuzz(100);
        System.out.println("====Stage1 Begins Here====");
        result.forEach(System.out::println);
        //output Stage1
        System.out.println("====Stage1 Ends Here====");
        System.out.println("====Stage2 Begins Here====");
        List<String> result2 = solution.fizzBuzz2(100);
        result2.forEach(System.out::println);
        //output Stage2
        System.out.println("====Stage2 Ends Here====");
    }
}
