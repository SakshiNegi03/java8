// Find the first even number in the integer list which is greater than 3.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
public class qus12 {
    public static void main(String[] args) {

        List<Integer> List = Arrays.asList(2, 1, 3, 8, 4, 9, 7);
        Optional<Integer> a;
        a = List
                .stream()
                .filter((num) -> {
                    return (num % 2 == 0 && num > 3);
                })
                .findFirst();
        if (a.isPresent())
            System.out.println(a.get());
        else
            System.out.println("No value");
    }
}
