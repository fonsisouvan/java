package _interface.IShape;

public class ShowShape {
    public static void main(String[] args){
        IShape c1 = new Circle(3);
        IShape c2 = new Circle(4);
        IShape r1 = new Recttangle(3,4);
        IShape r2 = new Recttangle(4,5);
        IShape[] list = {c1,c2,r1,r2};
        for (IShape s:list){
            System.out.println(s.getArea()+"\n"+s.getPerimeter());
        }
    }
}