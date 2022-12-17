import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountInString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Statement to count words :: ");
        String statement = scanner.nextLine();

        Map<String,Integer> wordsCount = new HashMap<>();
        String[] words = statement.split(" ");
        for(String word : words){
            if(wordsCount.containsKey(word)){
                wordsCount.put(word,wordsCount.get(word)+1);
            }else{
                wordsCount.put(word,1);
            }
        }
        System.out.println("Words count "+wordsCount);
    }

}
