// override default method of interface 

interface Test2{
    default void defaultMethod(){
        System.out.println("The default ");
    }
}
public class qus7 implements Test2 {
    @Override
    public void defaultMethod() {
        System.out.println("The overridden method sucessful!!");
    }
    public static void main(String[] args) {
        qus7 d = new qus7();
        d.defaultMethod();  
    }
}