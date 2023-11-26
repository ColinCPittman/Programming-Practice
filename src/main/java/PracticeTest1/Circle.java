package PracticeTest1;

public class Circle extends Shape{
    private double radius;
    public Circle() {
        radius = 0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
       return radius * 3.14;
    }
}
