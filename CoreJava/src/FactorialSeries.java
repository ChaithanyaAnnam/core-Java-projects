import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialSeries {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial1(6));
        List<Integer> myList = Arrays.asList(0,1,2,3,4,5,6,70,8,9);
        List<String> list = Arrays.asList("Java", "is", "my", "bread");
        myList.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
        myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
        list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static Integer factorial(Integer n) {
        Integer i = n;
        if (i != 1) {
            while (n >1) {
                i = i * (n - 1);
                //System.out.println(i);
                n = n - 1;
            }
        }
        return i;
    }

    public static Integer factorial1(Integer n) {
       Integer factorial = n;
       for(int j = n-1; j > 0;j--){
           factorial = factorial * j;
       }
       return factorial;
    }

}
