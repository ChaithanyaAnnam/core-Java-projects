package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilterListOfArrays {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> b = Arrays.asList(1,2,4,6,8,9,3);
        difference(a,b).forEach(System.out::println);
        System.out.println(filterLists(a,b));
    }
    public static List<Integer> difference(List<Integer> a, List<Integer> b){
        List<Integer> result = new LinkedList<>();
        for(Integer num : a){
            if(!b.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> filterLists(List<Integer> a, List<Integer> b){
        return a.stream().filter(x->!b.contains(x)).toList();
    }
}
