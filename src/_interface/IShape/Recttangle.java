package _interface.IShape;

public class Recttangle implements IShape{
    double length;
    double width;
    public Recttangle(double l,double w){
        this.length = l;
        this.width = w;
    }
    @Override
    public double getArea() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length*width);
    }
}
