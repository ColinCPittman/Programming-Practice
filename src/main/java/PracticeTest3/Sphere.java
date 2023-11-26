package PracticeTest3;

public class Sphere extends Shape3D{
    private double radius;

    @Override
    public double volume() {
        return (4.0/3.0) * 3.14 * Math.pow(this.radius, 3.0);
    }

    @Override
    public double surfaceArea() {
        return 4.0 * 3.14 * Math.pow(this.radius, 2.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }
}
