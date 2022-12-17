import java.util.Scanner;


public class SquareRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find Square root of :: ");
        try {
            double number = Double.parseDouble(scanner.nextLine());
            double sqrt = Math.sqrt(number);
            if (Double.isNaN(sqrt)) {
                System.out.println("Negative numbers don't have real square roots since a square is either positive or 0.");
            } else {
                System.out.println("Square root of " + number + " is :: " + sqrt);
            }
        }
        catch (NumberFormatException nfe){
            System.out.println("Input String cannot be parsed to Double.");
        }
    }
}
