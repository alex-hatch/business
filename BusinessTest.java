/**
 * Test class to test various classes in a business
 */
public class BusinessTest {
    public static void main(String[] args) {
        Executive executive1 = new Executive("John", "Smith", "123456789", new Address(123, "easy street", "city1", "00000", "state1"), 1, 10000, 90000);
        Executive executive2 = new Executive("Jane", "Smith", "223456789", new Address(223, "hard street", "city2", "00001", "state2"), 2, 10001, 90001);
        FullTimeSalaried fullTimeSalaried1 = new FullTimeSalaried("Jim", "Smith", "323456789", new Address(323, "medium street", "city3", "00002", "state3"), 3, 70000);
        FullTimeSalaried fullTimeSalaried2 = new FullTimeSalaried("Jerry", "Smith", "423456789", new Address(423, "slightly difficult street", "city4", "00003", "state4"), 4, 70001);
        FullTimeHourly fullTimeHourly1 = new FullTimeHourly("Jennifer", "Smith", "523456789", new Address(523, "something street", "city5", "00004", "state5"), 5, 20, 300);
        FullTimeHourly fullTimeHourly2 = new FullTimeHourly("Jake", "Smith", "623456789", new Address(623, "nothing street", "city6", "00005", "state6"), 6, 25, 200);
        PartTimeHourly partTimeHourly1 = new PartTimeHourly("Smith", "Smith", "723456789", new Address(723, "red street", "city7", "00006", "state7"), 7, 35);
        PartTimeHourly partTimeHourly2 = new PartTimeHourly("Smith", "John", "823456789", new Address(823, "blue street", "city8", "00007", "state8"), 8, 36);
        Contractor contractor1 = new Contractor("Jim", "John", "923456789", new Address(923, "contractor street", "city9", "00008", "state9"), 9, 40);
        Contractor contractor2 = new Contractor("Jane", "John", "133456789", new Address(1023, "another street", "city10", "00009", "state10"), 10, 38);
        Customer customer1 = new Customer("Custom", "Er", "143456789", new Address(1024, "customer street", "city11", "00010", "state11"), 11);
        Customer customer2 = new Customer("Er", "Custom", "153456789", new Address(1025, "customer road", "city12", "00011", "state12"), 12);

        executive1.introduce(false);
        System.out.println("executive 1 payment: " + executive1.computePay());

        System.out.println();

        executive2.introduce(true);
        System.out.println("executive 2 payment: " + executive2.computePay());

        System.out.println();

        fullTimeSalaried1.introduce(false);
        System.out.println("full time salary 1 payment: " + fullTimeSalaried1.computePay(52));

        System.out.println();

        fullTimeSalaried2.introduce(true);
        System.out.println("full time salary 2 payment: " + fullTimeSalaried2.computePay(52));

        System.out.println();

        fullTimeHourly1.introduce(false);
        System.out.println("full time hourly 1 payment: " + fullTimeHourly1.computePay(40));

        System.out.println();

        fullTimeHourly2.introduce(true);
        System.out.println("full time hourly 2 payment: " + fullTimeHourly2.computePay(40));

        System.out.println();

        partTimeHourly1.introduce(false);
        System.out.println("part time hourly 1 payment: " + partTimeHourly1.computePay(30));

        System.out.println();

        partTimeHourly2.introduce(true);
        System.out.println("part time hourly 2 payment: " + partTimeHourly2.computePay(41));

        System.out.println();

        contractor1.introduce(false);
        System.out.println("contractor 1 payment: " + contractor1.computePay(20));

        System.out.println();

        contractor2.introduce(true);
        System.out.println("contractor 2 payment: "+ contractor2.computePay(1));

        System.out.println();

        customer1.introduce();
        customer1.makePayment();

        System.out.println();

        customer2.introduce();
        customer2.makePayment();
    }
}
