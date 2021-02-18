//Implement multiple inheritance with default method inside  interface.

// first interface 
interface A {
    default void default1(){
        System.out.println("default function of interface A");
    }
}
// second interface
interface B{
    default void default1(){
        System.out.println("default function of interface B");
    }
}
// class implements multiple interface
class SampleClass implements A,B
{
    public void default1(){
        B.super.default1(); // Resolving multiple inheritance conflict
    }
}
public class qus8  {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.default1();
    }
}