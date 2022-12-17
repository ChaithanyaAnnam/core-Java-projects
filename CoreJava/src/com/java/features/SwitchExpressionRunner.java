package com.java.features;

public class SwitchExpressionRunner {

    public static String findDayOfTheWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1 : dayOfWeek = "Monday";break;
            case 2 : dayOfWeek = "Tuesday";break;
            case 3 : dayOfWeek = "Wednesday";break;
            case 4 : dayOfWeek = "Thursday";break;
            default : throw new IllegalArgumentException("Invalid day"+day);
        };
        return dayOfWeek;
    }
    //Using Switch Expression
    public static String findDayOfTheWeekWithSwitchExp(int day){
        String dayOfWeek =  switch (day){
            case 1 -> {
                System.out.println("do some logic here");
                yield "Monday";
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> throw new IllegalArgumentException("Invalid day"+day);
        };
        return dayOfWeek;
    }
    public static void main(String[] args) {
        System.out.println(findDayOfTheWeek(1));
        System.out.println(findDayOfTheWeek(4));

        System.out.println(findDayOfTheWeekWithSwitchExp(1));

    }
}
