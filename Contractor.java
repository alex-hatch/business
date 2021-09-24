/**
 * A class describing a contractor of a business
 */
public class Contractor extends Employee{
    private double basePay;

    public Contractor() {

    }

    public Contractor(String firstname, String lastName, String ssn, Address address, int id, double basePay) {
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

    public void introduce(boolean displaySNN) {
        if(displaySNN) {
            System.out.println(this);
        } else {
            System.out.println("firstname='" + getFirstname() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age=, " + getAge() + '\'' +
                    ", address: " + getAddress() +
                    ", id='" + getId() + '\'' +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit='" + getDirectDeposit() + '\'' +
                    ", basePay='" + basePay + '\'');
        }
    }

    public double computePay(int numHrs) {
        return (basePay * numHrs);
    }
}
