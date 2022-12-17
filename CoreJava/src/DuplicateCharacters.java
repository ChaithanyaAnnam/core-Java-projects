import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dupChString = scanner.next();
        printDuplicateCharacters(dupChString);
    }
    public static void printDuplicateCharacters(String word){
        Map<Character,Integer> charMap = new LinkedHashMap<>();
        char[] chars = word.toCharArray();

        for(Character ch : chars){
            charMap.put(ch,charMap.containsKey(ch) ? charMap.get(ch)+1 : 1);
        }
        Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();

        System.out.printf("List of duplicate characters in String '%s' %n", word);

        for(Map.Entry<Character,Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.printf("%s: %d %n", entry.getKey(),entry.getValue());
            }
        }
    }

}
