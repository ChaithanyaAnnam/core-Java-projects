import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer limit = scanner.nextInt();

        for(int number=2;number<=limit;number++){
            if(isPrime(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
