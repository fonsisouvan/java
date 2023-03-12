package Pizza;

public class Rectangle implements IShape{
    private double _width;
    private double _heigth;
    public Rectangle(double w,double h){
        _width = w;
        _heigth = h;
    }

    @Override
    public double getArea() {
        return 0;


    }
}
