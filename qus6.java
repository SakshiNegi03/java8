// create access default and static method of interface 

@FunctionalInterface
interface Test {
    void over();

    default void defaultMethod(){
        System.out.println("oops default method");
    }

    static void staticInterfaceMethod(){
        System.out.println("oops static method");
    }
}
public class qus6
{
    public static void main(String[] args) {
        Test r = ()->{
            System.out.println("hey overridden");
        };
// invoking over method
        r.over(); 
 // invoking default method
        r.defaultMethod();  
 //invoking static method        
        Test.staticInterfaceMethod();    
    }
}