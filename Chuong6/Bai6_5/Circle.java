package Chuong6.Bai6_5;

public class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "Circle[radius= "+ radius + "]";
    }


}
