// Sum all the numbers greater than 5 

import java.util.Arrays;
import java.util.List;
public class qus10  {
    public static void main(String[] args) {

        List<Integer> List = Arrays.asList(7, 8, 6, 4, 5, 9, 1);
        int a;
        a = List
                .stream()
                .filter(num -> num > 5)
                .mapToInt(num -> num)
                .sum();
        System.out.println(a);
    }
}