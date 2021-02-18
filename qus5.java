//  Implement following functional interfaces from java.util.function using lambdas
import java.util.Random;
import java.util.function.*;

public class qus5 {
    public static void main(String[] args) {
// consumer
        Consumer printer = (T) -> {
            System.out.println(T);
        };
        printer.accept("Hello");

// supplier
        Supplier RanInt = () -> {
            Random random = new Random();
            return random.nextInt(51);
        };
        System.out.println("random Integer between 0-50: " + RanInt.get());

//predicate
        Predicate<String> EvenLeng = (S) -> {
            return (S.length() % 2 == 0);
        };
        String test = "Hello";
        System.out.println("check if\""+test+"\" is a Even length String : " +EvenLeng.test(test));
//function
        Function<Integer,Integer> square = (number)->{return (number*number*number);};
        System.out.println("cube of 4 is " + square.apply(4));

    }
}