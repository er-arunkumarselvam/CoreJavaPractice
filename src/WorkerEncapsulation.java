public class WorkerEncapsulation {

    private String name;
    private int age;
    private boolean isActive;

    // Setter : values get from the user, to set the variable
    public void setWorkerName(String workerName){
        this.name = workerName;
    }

    // Getter : values to display the user
    public String getWorkerName(){
        return this.name;
    }

    public void setAge(int yourAge){
        this.age = yourAge;
    }

    public int getAge(){
      return this.age;
    }

    public void setIsPresent(boolean attendance){
        this.isActive = attendance;
    }

    public boolean getIsPresent(){
        return this.isActive;
    }
}
