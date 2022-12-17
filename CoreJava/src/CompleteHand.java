import java.io.*;
import java.util.*;

public class CompleteHand {


    public static void main(String[] argv) {
        String tiles1 = "88844";
        String tiles2 = "99";
        String tiles3 = "55555";
        String tiles4 = "22333333";
        String tiles5 = "73797439949499477339977777997394947947477993";
        String tiles6 = "111333555";
        String tiles7 = "42";
        String tiles8 = "888";
        String tiles9 = "100100000";
        String tiles10 = "346664366";
        String tiles11 = "8999998999899";
        String tiles12 = "17610177";
        String tiles13 = "600061166";
        String tiles14 = "6996999";
        String tiles15 = "03799449";
        String tiles16 = "66444433335555";

        System.out.printf(isComplete(tiles1)?tiles1 +" Complete Hand":tiles1+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles2)?tiles2 +" Complete Hand":tiles2+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles3)?tiles3 +" Complete Hand":tiles3+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles4)?tiles4 +" Complete Hand":tiles4+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles5)?tiles5 +" Complete Hand":tiles5+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles6)?tiles6 +" Complete Hand":tiles6+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles7)?tiles7 +" Complete Hand":tiles7+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles8)?tiles8 +" Complete Hand":tiles8+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles9)?tiles9 +" Complete Hand":tiles9+" Not a Complete Hand");System.out.println();
        System.out.printf(isComplete(tiles10)?tiles10 +" Complete Hand":tiles10+" Not a Complete Hand");System.out.println();

    }

    public static boolean isComplete(String tile) {
        boolean isComplete = true;
        Map<Character, List<String>> collectTiles = new HashMap<>();
        String[] array = tile.split("");
        //System.out.println(Arrays.stream(array).toList());
        Set<String> numbers = convertArrayToSet(array);
        List<String> list = new ArrayList<>();
        for (String ch : numbers) {
            //list = new ArrayList<>();
            StringBuilder temp = new StringBuilder(3);
            for(int i=0;i<array.length;i++)
            {
                if(temp.length()<3 && ch.equals(array[i])){
                    temp.append(ch);
                }
                if(temp.length()==3){
                    list.add(temp.toString());
                    temp = new StringBuilder(3);
                }

            }
            if(temp.length()<3){list.add(temp.toString());}

        }
        //System.out.println(list);
        boolean isTriple = false; boolean isPair = false;
        for(String tileValue : list){
            if(tileValue.length()<2){isComplete = false; break;}
            if(tileValue.length()==3){
                isTriple = true;
            }
            if(tileValue.length()==2){
                if(isPair){isComplete = false; break;}
                isPair = true;
            }

        }
        if((isTriple && isPair) || (isPair)){
            isComplete = true;
        }
        return isComplete;
    }

    public static <T> Set<T> convertArrayToSet(T array[]) {

        // Create an empty Set
        Set<T> set = new TreeSet<>();

        // Iterate through the array
        for (T t : array) {
            // Add each element into the set
            set.add(t);
        }

        // Return the converted Set
        return set;
    }


}