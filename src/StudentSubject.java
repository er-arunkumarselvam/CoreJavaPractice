public class StudentSubject {

    private String name;
    private boolean isPresent;

    // Constructor
    StudentSubject(){} // Empty Constructor

    StudentSubject(String word){
        this.name = word;
    }

    StudentSubject(String word, boolean attendanceStatus){
        this.name = word;
        this.isPresent = attendanceStatus;
    }

    public void print(){
        System.out.println(name);
        System.out.println(isPresent);
    }
}
