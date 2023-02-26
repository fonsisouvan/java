package _IEmployee;

public class TestIEmployee {
    public static void main(String[] args){
        IEmpioyee a = new Employ("fon",20);
        System.out.println("Name = "+ a.getname()+", Salary = "+a.culcaltesalary());
        IEmpioyee b = new PartTimeEmployee("DE",20,8);
        System.out.println("Name = "+ b.getname()+", Salary = "+b.culcaltesalary());
        IEmpioyee c = new FullTimeEmployee("NG",20);
        System.out.println("Name = "+ c.getname()+", Salary = "+c.culcaltesalary());
    }

}
