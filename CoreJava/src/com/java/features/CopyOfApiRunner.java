package com.java.features;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ranga");
        names.add("chaitu");
        names.add("Anil");
        List<String> copyOfNames = List.copyOf(names);
        //Throws UnsupportedOperationException, as copyOf collection is unmodifiable
        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names ){
        names.add("ShouldNotBeAllowed");
    }
}
