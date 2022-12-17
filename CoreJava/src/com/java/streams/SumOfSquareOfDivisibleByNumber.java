package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfDivisibleByNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int sum = numbers.stream().filter(n->n%3==0).map(n->n*n).reduce(0,Integer::sum);
        System.out.println("final value"+sum);

        String sample = "krishna64";
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

}
