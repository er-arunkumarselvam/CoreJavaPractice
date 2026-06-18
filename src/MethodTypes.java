public class MethodTypes {

    String name = "Raja";
    String firstName;
    int number1 = 10;
    int number2 = 8;

    // No arguments and No return type
    public void print(){
        System.out.println(name);
    }

    // With arguments and No return type
    public void print2(String word){
        firstName = word;
        System.out.println(firstName);
    }

    // Without arguments and with return type
    public int print3(){
        return number1+number2;
    }

    // With arguments and with return type
    public int print4(int num3, int num4){
        int results = num3*num4;
        return results;
    }
}
