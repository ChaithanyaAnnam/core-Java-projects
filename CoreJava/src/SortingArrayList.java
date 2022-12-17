import java.util.*;
import java.util.stream.Collectors;

public class SortingArrayList {
    public static void main(String[] args){
        List<Integer> list= new ArrayList<>(Arrays.asList(15,3,5,2,7,9,7,0,3,12,35));
        System.out.println("List of numbers : "+list);

        List<Integer> distinctList = list.stream().distinct().toList();
        List<Integer> newList = distinctList.stream().sorted(Collections.reverseOrder()).toList();

        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println("");
        String outnumbers = list.stream().sorted(Integer::compare).map(n->String.valueOf(n)).collect(Collectors.joining(","));
        System.out.println(outnumbers);
        list.stream().sorted(Integer::compareTo).toList().forEach(System.out::println);
        System.out.println("");
        list.stream().sorted(Comparator.naturalOrder()).toList().forEach(System.out::println);

        System.out.println("Highest number in the list is :: "+newList);
        System.out.println("Highest number in the list is :: "+newList.get(0));
        System.out.println("Second Highest number in the list is :: "+newList.get(1));

        List<String> fruits = Arrays.asList("Orange","Banana","Apple","Mango");
        System.out.println("List of fruits :: "+fruits);

        List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println("Sorted List of fruits :: "+sortedFruits);

        List<String> lambdaFruits = fruits.stream().sorted(String::compareTo).toList();
        System.out.println("Sorted List of fruits :: "+lambdaFruits);

        List<String> sortFruits = fruits.stream().sorted().toList();
        System.out.println("Sorted List of fruits :: "+sortFruits);



        List<String> lambdaFruitsDesc = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).toList();
        System.out.println("Sorted List in descending order of fruits :: "+lambdaFruitsDesc);

        List<String> sortFruitsDesc = fruits.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted List in descending order of fruits :: "+sortFruitsDesc);
    }
}