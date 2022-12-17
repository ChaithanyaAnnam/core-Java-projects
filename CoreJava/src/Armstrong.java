import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        System.out.printf("The number %d is "+(isArmstrong(number)?"Armstrong":"not a Armstrong"),number);
    }
    public static boolean isArmstrong(Integer number){
        int originalNumber = number;
        int result = 0;
        while(number!=0){
            int remainder = number%10;
            result = result + remainder*remainder*remainder;
            number = number/10;
        }
        return result == originalNumber;
    }
}
