//Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference  

import java.util.Arrays;

interface DemoInterface {
    String myMethod(char [] chars);
}

class Employee{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
@FunctionalInterface
interface EmployeeInterface{
    Employee createEmployee(int id, String name, int salary);
}

public class employe {

    public static void main(String[] args) {

        EmployeeInterface employeeInterface = Employee::new;
        EmployeeInterface employeeInterfaceLambda = (id,name,salary)->new Employee(id,name,salary);
        Employee employee = employeeInterface.createEmployee(01,"Avinash",300000);
        System.out.println(employee);

       
    }

}