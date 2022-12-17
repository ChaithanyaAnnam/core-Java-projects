package com;

import com.exception.CustomException;

import javax.swing.*;
import java.util.Optional;
import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) throws CustomException {

        //int[] numbers= {12,-1};
        //int[] numbers= null;
        //int[] numbers= {};
        int[] numbers= {-1,67,690};
        try {
            System.out.println(findMaxNumber(numbers));
        }catch(CustomException exception){
            System.out.println(exception.getMessage());
        }


    }
    public static int findMaxNumber(int[] numbers) throws CustomException{
        Optional<int[]> intNumbers = Optional.ofNullable(numbers);
        intNumbers.orElseThrow(() -> new CustomException("There is no Max number"));
        if(numbers.length==0) throw new CustomException("Object is empty");
        int max = 0;
        if(intNumbers.isPresent() && numbers.length>0){
            max = numbers[0];
            for(int i=1;numbers.length>1 && i<numbers.length;i++){
                if(max<numbers[i]){
                    max = numbers[i];
                }
            }
        }
        return max;
    }
}
