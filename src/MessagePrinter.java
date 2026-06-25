// 1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".
public class MessagePrinter {

    String name;

    MessagePrinter(String userName){
        this.name = userName;
    }

    public void print(){
        System.out.println("Hello,"+ name);
    }
}
