package com.java.features;

import java.util.List;

public class TypeInferenceRunner {
    public static void main(String[] args) {
        List<String> names = List.of("Chaitu","Anil");
        List<String> names1 = List.of("Chaitu1","Anil1");

        List<List<String>> namesList = List.of(names,names1);

        //Instead of above
        var namesL = List.of(names,names1);
        namesL.stream().forEach(System.out::println);

        // Var can be used in loops
        for(var s:names){
            System.out.println(s);
        }
    }
}
