/**
 * A class to describe a general person
 */
public abstract class Person {
    private String firstname;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;

    public Person() {

    }

    public Person(String firstname, String lastName, String ssn, Address address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.ssn = ssn;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", ssn='" + ssn + '\'' +
                ", address: " + address;
    }
}
