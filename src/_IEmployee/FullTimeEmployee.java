package _IEmployee;

public class FullTimeEmployee extends Employ{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 4*25*getPaymentPerHour();
    }
}
