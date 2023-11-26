package PracticeTest1;

public class Square extends Shape{
     double width;

    double height;

    public Square() {
        width = 0;
        height = 0;
    }

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area() {
        return width * height;
    }
}
