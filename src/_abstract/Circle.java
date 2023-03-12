package _abstract;

public class Circle extends Shape{
    double radius;

    public Circle() {
        super();
        radius = -1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
