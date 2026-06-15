class Main{
    public static void main(String[] args){

        //  Object creation
        Employee emp1 = new Employee();

        emp1.name = "Arun";
        emp1.age =  27;
        emp1.salary = 50000.0;
        emp1.isActive = true;

        emp1.print();

        Employee emp2 = new Employee();

        emp2.age = 20;
        emp2.isActive = false;

        emp2.print();

    }
}