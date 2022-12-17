import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveArrayListDeplicates {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,6,6,7,8,9,11,7));

        System.out.println("ArrayList with duplicates : "+list);

        List<Integer> newList = list.stream().distinct().toList();

        System.out.println("ArrayList without duplicates : "+newList);
    }
}
