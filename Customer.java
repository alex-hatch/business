/**
 * A class describing a customer of a business
 */
public class Customer extends Person{
    private int customerID;
    private String payPreference;

    public Customer() {

    }

    public Customer(String firstname, String lastName, String ssn, Address address, int customerID) {
        super(firstname, lastName, ssn, address);
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPayPreference() {
        return payPreference;
    }

    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }

    @Override
    public String toString() {

        return "firstname='" + getFirstname() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", address: " + getAddress() +
                ", customerID='" + customerID + '\'' +
                ", payPreference='" + payPreference + '\'';
    }

    public void introduce() {
        System.out.println(this);
    }

    public void makePayment() {
        System.out.println(payPreference);
    }
}
