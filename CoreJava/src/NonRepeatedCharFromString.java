import java.util.*;

public class NonRepeatedCharFromString
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        printNonRepeatedCharacters(word);
        System.out.printf("First Non repeated character in string '%s' is %s %n",word, printNonRepeatedChar(word));
    }
    public static void printNonRepeatedCharacters(String word){

        Map<Character,Integer> charCounts = new LinkedHashMap<>();
        char[] chars = word.toCharArray();
        for (char ch : chars){
            if(charCounts.containsKey(ch)){
                charCounts.put(ch,charCounts.get(ch)+1);
            } else{
                charCounts.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = charCounts.entrySet();
        for(Map.Entry<Character,Integer>  characterIntegerMap: entrySet){
            if(characterIntegerMap.getValue()==1){
                System.out.printf("First Non repeated character in string '%s' is %s %n",word, characterIntegerMap.getKey());
                break;
            }
            //System.out.printf("%s: %d %n",characterIntegerMap.getKey(),characterIntegerMap.getValue());
        }

        for(Map.Entry<Character,Integer> characterIntegerMap: entrySet){
            System.out.printf("%s: %d %n",characterIntegerMap.getKey(),characterIntegerMap.getValue());
        }

    }
    //Improved code
    public static char printNonRepeatedChar(String word) {

        Map<Character, Integer> charCounts = new LinkedHashMap<>(word.length());
        for (char ch : word.toCharArray()) {
            charCounts.put(ch, charCounts.containsKey(ch) ? charCounts.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> characterIntegerMap : charCounts.entrySet()) {
            if (characterIntegerMap.getValue() == 1) {
               return characterIntegerMap.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
}
