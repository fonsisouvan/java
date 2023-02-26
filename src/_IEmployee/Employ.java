package _IEmployee;

public class Employ implements IEmpioyee {
    String name;
    int paymentPerHour;

    public Employ(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public int culcaltesalary() {
        return 8*30;
    }
}
