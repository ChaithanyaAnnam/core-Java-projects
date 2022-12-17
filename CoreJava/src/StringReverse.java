import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Original String :: ");

        String originalString = scanner.nextLine();
        scanner.close();

        String[] words = originalString.split("\\s");
        StringBuilder reverseWord = new StringBuilder();
        for (String word : words) {
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord.append(word.charAt(j));
            }
            reverseWord.append(" ");
        }
        System.out.println("Reverse word :: " + reverseWord.toString().stripTrailing());
        System.out.println("Using recursion "+reverseString(originalString));


    }

    public static String reverseString(String statement) {
        System.out.println(statement+"  "+statement.charAt(0));
        //base case to handle one char string and empty string
        if (statement.length() < 2) {
            System.out.println("inside if"+statement);
            return statement;
        }
        //System.out.println(statement.substring(1));
        return reverseString(statement.substring(1)) + statement.charAt(0);
    }
}
