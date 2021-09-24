/**
 * An abstract class to describe a general employee
 */
public abstract class Employee extends Person{
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    public Employee() {

    }

    public Employee(String firstname, String lastName, String ssn, Address address, int id) {
        super(firstname, lastName, ssn, address);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    @Override
    public String toString() {
        return super.toString() + ", id='" + id + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", directDeposit='" + directDeposit + '\'';
    }
}
