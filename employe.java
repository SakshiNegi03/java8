//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference  

class employee
{
	String name;
	int age;
	String city;

employee(){
name = "Sana";
age = 24;
city = "Delhi";

}

void show() {
	System.out.println(name+" "+age+" "+city);
}
}
public class employe{
	public static void main(String[] args ) {
		employee G1 = new employee();
		G1.show();
	}
}
