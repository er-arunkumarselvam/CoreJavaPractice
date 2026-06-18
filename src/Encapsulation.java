public class Encapsulation {

    public static void main(String[] args){

        WorkerEncapsulation we = new WorkerEncapsulation();

        // Set value
        we.setWorkerName("Krishna");

        // Get value
        System.out.println(we.getWorkerName());

        we.setAge(29);
        we.setIsPresent(true);

        System.out.println(we.getAge());
        System.out.println(we.getIsPresent());


    }
}
