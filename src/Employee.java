public class Employee{

    String name;
    int age;
    double salary;
    boolean isActive;

//    Empty Constructor (Automatically Call in java)
    Employee(){}

    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isActive);
    }
}