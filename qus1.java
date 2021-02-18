// checking which is the greater value
@FunctionalInterface
interface Greater{
    boolean isGreat(int a, int b);
}
// Increment the number by 1 and return incremented value
@FunctionalInterface
interface Increments {
    int increment(int a);
}

// Concatenation of 2 string 
@FunctionalInterface
interface Concatenates{
    String concat(String s1, String s2);
}

//Convert a string to uppercase 
@FunctionalInterface
interface Capitalize{
   String capital(String s);
}

public class qus1 {
    public static void main(String[] args) {

        // Implementation for finding  the greater value 
        Greater g = (int a,int b)->{return (a>b);};
        System.out.println(g.isGreat(2, 3));

        // Implementation for incrementing value 
        Increments i = (int a) -> {return a+1;};
        System.out.println(i.increment(3));

        // Implementation for concatinating the string 
        Concatenates c = (s1,s2)->{return s1+s2;};
        System.out.println(c.concat("sak","shi"));

        // Implementation for changing string to uppercase
        Capitalize cp = (s)->{return s.toUpperCase();};
        System.out.println(cp.capital("sakshi"));

    }
}