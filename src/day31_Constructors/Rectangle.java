package day31_Constructors;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea (){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2 * (length+width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + calculateArea() +
                ", Perimeter=" + calculatePerimeter() +
                '}';
    }
}
