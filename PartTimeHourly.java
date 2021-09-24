/**
 * A class to describe a part time employee that is paid per hour
 */
public class PartTimeHourly extends Employee{
    private double baseHourlyPay;

    public PartTimeHourly() {

    }

    public PartTimeHourly(String firstname, String lastName, String ssn, Address address, int id, double baseHourlyPay) {
        super(firstname, lastName, ssn, address, id);
        this.baseHourlyPay = baseHourlyPay;
    }

    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return super.toString() + ", baseHourlyPay='" + baseHourlyPay +'\'';
    }

    public void introduce(boolean displaySNN) {
        if(displaySNN) {
            System.out.println(this);
        } else {
            System.out.println("firstname='" + getFirstname() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", age='" + getAge() + '\'' +
                    ", address: " + getAddress() +
                    ", id='" + getId() + '\'' +
                    ", educationLevel='" + getEducationLevel() + '\'' +
                    ", directDeposit='" + getDirectDeposit() + '\'' +
                    ", baseHourlyPay='" + baseHourlyPay + '\'');
        }
    }

    /**
     * A part time employee cannot work over 40 hours in a pay period. If this happens, flag the employee.
     * @param numHrs The number of hours worked in a pay period
     * @return The pay the employee should receive. -1 If the employee worked over 40 hours.
     */
    public double computePay(int numHrs) {
        if(numHrs > 40) {
            return -1;
        } else {
            return (numHrs * baseHourlyPay);
        }
    }
}
