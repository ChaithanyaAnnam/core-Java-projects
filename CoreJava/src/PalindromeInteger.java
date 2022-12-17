import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        boolean isPalindrome = isNumberPalindrome(number);
        System.out.printf("The number %d is "+(isPalindrome?"Palindrome":"not a Palindrome"),number);
    }
    public static boolean isNumberPalindrome(Integer number){
        int reverse = 0,temp = number;
        while(temp!=0){
            reverse = reverse*10 + temp%10;
            temp = temp/10;
        }
        return number.equals(reverse);
    }
}
