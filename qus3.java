// Using (instance) Method reference create and
// apply add and subtract method
// and using (Static) Method reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface bit {
    int perform(int a, int b);
}

class Operation{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }
}

public class qus3 {

    public static void main(String[] args) {

        bit addition = new Operation()::add;
        System.out.println(addition.perform(5,4));

        bit subtraction = new Operation()::subtract;
        System.out.println(subtraction.perform(30,15));

        bit multiply = Operation::multiply;
        System.out.println(multiply.perform(9,19));
    }
}
