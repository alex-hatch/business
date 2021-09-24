/**
 * A class to describe a full time employee on salary
 */
public class FullTimeSalaried extends FullTimeEmployee{
    public FullTimeSalaried() {

    }

    public FullTimeSalaried(String firstname, String lastName, String ssn, Address address, int id, double basePay) {
        super(firstname, lastName, ssn, address, id, basePay);
    }

    @Override
    public String toString() {
        return super.toString();
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
                    ", directDeposit='" + getDirectDeposit() + '\'' +
                    ", basePay='" + getBasePay() + '\'');
        }
    }

    public double computePay(int numWeeks) {
        return (getBasePay() * numWeeks / 52);
    }
}
