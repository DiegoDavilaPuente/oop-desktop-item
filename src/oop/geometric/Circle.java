package oop.geometric;

public class Circle implements GeometricObject {
    protected double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
