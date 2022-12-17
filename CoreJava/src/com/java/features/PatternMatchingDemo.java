package com.java.features;

public class PatternMatchingDemo {
    public static void main(String[] args) {

        Object o = "abc";
        //Before java 16
        if(o instanceof String){
            String s = (String) o;
            System.out.println(s.length());
        }

        //after java 16
        if(o instanceof String s){
            System.out.println(s.length());
        }

        Object o1 = 1;
//after java 16
        if(!(o1 instanceof String s)) {
            System.out.println(0);
        }else{
            System.out.println(s.length());
        }
    }
}
