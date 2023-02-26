package _interface;

public class ShowShape {
    public static void main(String[] args){
        IShape c1 = new Circle(6);
        IShape r1 = new Recttangle(5,6);
        IShape[] list = {c1,r1};
        for (IShape s:list){

            System.out.println(s.getArea()+"\n"+s.getPerimeter());
        }
    }
}
