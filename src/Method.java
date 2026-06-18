public class Method {

    public static void main(String[] args){

        MethodTypes mt = new MethodTypes();

        mt.print();
        mt.print2("Rahul");
//        System.out.println(mt.print3());
        int result = mt.print3();
        System.out.println(result);
        System.out.println(mt.print4(5,22));

    }
}
