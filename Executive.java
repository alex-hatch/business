/**
 * A class to describe a general executive of a business
 */
public class Executive extends Employee{
    private double yearlyBonus;
    private double yearlyCompensation;

    public Executive() {

    }

    public Executive(String firstname, String lastName, String ssn, Address address, int id, double yearlyBonus, double yearlyCompensation) {
        super(firstname, lastName, ssn, address, id);
        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

    public double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(double bonus) {
        this.yearlyBonus = bonus;
    }

    public double getCompensation() {
        return yearlyCompensation;
    }

    public void setCompensation(double compensation) {
        this.yearlyCompensation = compensation;
    }

    @Override
    public String toString() {
        return super.toString() + ", yearlyBonus='" + yearlyBonus + '\'' +
                ", yearlyCompensation='" + yearlyCompensation + '\'';
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
                    ", yearlyBonus='" + yearlyBonus + '\'' +
                    ", yearlyCompensation='" + yearlyCompensation + '\'');
        }
    }

    public double computePay() {
        return yearlyCompensation + yearlyBonus;
    }
}
