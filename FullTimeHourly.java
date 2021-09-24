/**
 * A class to describe a full time employee that is paid per hour
 */
public class FullTimeHourly extends FullTimeEmployee{
    private double overtimePay;

    public FullTimeHourly() {

    }

    public FullTimeHourly(String firstname, String lastName, String ssn, Address address, int id, double basePay, double overtimePay) {
        super(firstname, lastName, ssn, address, id, basePay);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() + ", overtimePay=" + overtimePay + '\'';
    }

    public void introduce(boolean displaySSN) {
        if(displaySSN) {
            System.out.println(this);
        } else {
            System.out.println("firstname='" + getFirstname() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age='" + getAge() + '\'' +
                    ", address: " + getAddress() + '\'' +
                    ", id='" + getId() + '\'' +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit='" + getDirectDeposit() + '\''+
                    ", basePay='" + getBasePay() + '\'' +
                    ", overtimePay='" + overtimePay + '\'');
        }
    }

    public double computePay(int numHrs) {
        return ((numHrs * getBasePay()) + overtimePay);
    }
}
