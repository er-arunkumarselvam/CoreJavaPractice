//4. Create a class Biggest that contains a single-dimensional array as a data member and a
//method display() to find and display the largest element of the array.
public class ArrayLargestNumber {

    private int biggest;

    public void display(int[] arrayBigNo){

        for(int n=0; n<arrayBigNo.length;n++){
           if(arrayBigNo[n] > biggest){
               biggest = arrayBigNo[n];
           }
        }
        System.out.println(biggest);

    }

}
