import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer p = 1, q = 0,r = 0;

        while(q<=n){
            System.out.println(q);
            q = p + r;
            p = r;
            r = q;

        }

    }
}
