/**
 * A class to describe a full time employee of a business
 */
public abstract class FullTimeEmployee extends Employee{
    private double basePay;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(String firstname, String lastName, String ssn, Address address, int id, double basePay) {
        super(firstname, lastName, ssn, address, id);
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return super.toString() + ", basePay='" + basePay + '\'';
    }
}
