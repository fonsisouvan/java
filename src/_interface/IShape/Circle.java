package _interface.IShape;

public class Circle implements IShape{
    double radius;
    public Circle(double r){
        this.radius = r;
    }
    @Override
    public double getArea() {
        return radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*radius;
    }
}
