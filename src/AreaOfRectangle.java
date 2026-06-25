//6. Create a class Rectangle with attributes length and width, each defaulting to 1. The class should include set and get methods
//for both attributes, and a method to calculate the area of the rectangle.
public class AreaOfRectangle {

    private double length;
    private double width;


    AreaOfRectangle(){
        this.length = 1;
        this.width = 1;
    }

    AreaOfRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        if(length <= 0){
            System.out.println("Enter a positive number");
            return;
        }
        this.length = length;
    }

    public void setWidth(double width){
        if(width <= 0){
            System.out.println("Enter a positive number");
            return;
        }

        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

//    Calculate Area
    public double calcuateArea(){
        return length*width;
    }

}
