package arrays;

import java.util.Arrays;

public class MissingNumberInList {

    public static void main(String[] args) {
        Double D = Double.valueOf(10);
        double d = 20;
        int[] intArray = new int[]{1,2,3,5,4,6,8};

        int missingNumber = getMissingNumber(intArray,8);

        System.out.printf("Missing number is %d ",missingNumber);
    }

    public static int getMissingNumber(int[] array, int count){
        //sum of n numbers
        int result = (count*(count+1))/2,total=0;
        //Sum of given numbers
        for(int num: array){total=total+num;}
        return result - total;
    }
}
