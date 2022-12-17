package com;

public class CustomInterview {

    public static void main(String[] args) throws Exception{
        try{
            Integer i = 10;
            int result = i/0;
            System.out.println("try");
            throw new Exception();
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            throw new Exception();
        }
        catch (Exception e){
            System.out.println("catch");
           throw new Exception();
        }

        finally {
            System.out.println("finally");
        }

    }
}
