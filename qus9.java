//Collect all the even numbers from an integer list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class qus9 {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(3,6,5,9,7,8,2);
        List<Integer> evenlist;
        evenlist = List
                .stream()
                .filter(num->num%2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenlist);
    }
}