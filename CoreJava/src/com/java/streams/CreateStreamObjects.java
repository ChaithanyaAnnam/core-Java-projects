package com.java.streams;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

        //Create a stream
        Stream<String> stringStream = Stream.of("a","b","c");
        stringStream.forEach(System.out::println);

        //Create a Stream of sources
        Collection<String> stringCollection = Arrays.asList("JAVA","C","C++",".Net");
        Stream<String> stringStream1 = stringCollection.stream();
        stringStream1.forEach(System.out::println);

        List<String> stringList = Arrays.asList("JAVA","C","C++",".Net");
        Stream<String> stringStream2 = stringList.stream();
        stringStream2.forEach(System.out::println);

        Set<String> stringSet = new HashSet<>(stringList);
        Stream<String> stringStream3 = stringSet.stream();
        stringStream3.forEach(System.out::println);

        String[] strArray = {"a","b","c"};
        Stream<String> stringStream4 = Arrays.stream(strArray);
        stringStream4.forEach(System.out::println);

    }

}
