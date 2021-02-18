// Q10) Find average of the number inside integer list after doubling it.

import java.util.*;
public class qus11 {
    public static void main(String[] args) {
        List<Integer> List = Arrays.asList(9,2,1,8,5,4,7);
        OptionalDouble avg;
        avg = List
                .stream()
                .map(num -> num * 2)
                .mapToInt(num->num)
                .average();
        System.out.println(avg);
    }
}