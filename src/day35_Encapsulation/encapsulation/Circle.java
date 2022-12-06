package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
