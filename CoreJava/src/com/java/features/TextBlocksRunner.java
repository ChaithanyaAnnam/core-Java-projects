package com.java.features;

public class TextBlocksRunner {
    public static void main(String[] args) {
        String str = """
                Line 1
                    Line 2
                    "Line 3" 
                Line 4""";
        System.out.println(str);

        String textBlock = """
                Line 1 : %s
                Line 2 : %s
                Line 3 
                Line 4""".formatted("Text1", "Text2");
        System.out.print(textBlock);


    }
}
