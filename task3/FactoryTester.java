package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person p1 = new Person("John", "Doe", "123456789");
        Person p2 = new Person("Jane", "Smith", "987654321");

        // Adding persons
        factory.addPerson(p1);
        factory.addPerson(p2);

        // Displaying staff
        System.out.println("Staff after additions:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }

        // Save staff to file
        factory.saveStaffToFile("staff.dat");

        // Clear the current staff list
        factory.getStaff().clear();

        // Load staff from file
        factory.loadStaffFromFile("staff.dat");

        // Displaying staff after loading from file
        System.out.println("Staff after loading from file:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }
    }
}
