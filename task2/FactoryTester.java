package finalexam.task2;

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

        // Deleting a person
        factory.deletePerson(p1);

        // Displaying staff after deletion
        System.out.println("Staff after deletion:");
        for (Person p : factory.getStaff()) {
            System.out.println(p);
        }
    }
}

