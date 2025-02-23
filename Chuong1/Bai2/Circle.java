package Chuong1.Bai2;

public class Circle {
    private double radius = 1.0;


    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public String toString(){
        return "Circle[" + radius +"]";
    }
}
