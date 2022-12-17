import java.util.Arrays;

public class TwoStringsAreAnagrams {
    /* * Another way to check if two Strings are anagram or not in Java
     * * This method assumes that both word and anagram are not null and lowercase
     * * @return true, if both Strings are anagram. */
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean checkAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] charFromWord = word.toCharArray();
        for (char ch : charFromWord) {
            int index = anagram.indexOf(ch);
            if (index != -1) {
                anagram = anagram.substring(0, index)
                        + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(TwoStringsAreAnagrams.iAnagram("word", "wrdo"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("mary", "army"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("stop", "tops"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("boat", "btoa"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("pure", "in"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("fill", "fil"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("b", "bbb"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("ccc", "ccccccc"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("a", "a"));
        System.out.println(TwoStringsAreAnagrams.iAnagram("sleep", "slep"));

        System.out.println("Testing checkAnagram method");
        System.out.println(TwoStringsAreAnagrams.checkAnagram("word", "wrdo"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("mary", "army"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("stop", "tops"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("boat", "btoa"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("pure", "in"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("fill", "fil"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("b", "bbb"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("ccc", "ccccccc"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("a", "a"));
        System.out.println(TwoStringsAreAnagrams.checkAnagram("sleep", "slep"));
    }

}
