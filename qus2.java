// method taking 2 integers and returning 1 integer 

@FunctionalInterface
interface FunInt {
    int fun(int a, int b);
}

class Demo{
    public int add(int a, int b){
        return a+b;
    }
}

public class qus2 {

    public static void main(String[] args) {

        FunInt addition = new Demo()::add;
        System.out.println(addition.fun(7, 3));
    }
}