package finalexam.task4;

public class FactoryTester {
    public static void main(String[] args) {
        School school = new School("123 Main St", "VAT123456");

        Teacher t1 = new Teacher("Alice", "Johnson", "T001");
        Teacher t2 = new Teacher("Bob", "Williams", "T002");

        // Adding teachers
        school.addTeacher(t1);
        school.addTeacher(t2);

        // Displaying staff
        System.out.println("Staff after additions:");
        for (Teacher t : school.getStaff()) {
            System.out.println(t);
        }

        // Save staff to file
        school.saveStaffToFile("staff.csv");

        // Clear the current staff list
        school.getStaff().clear();

        // Load staff from file
        school.loadStaffFromFile("staff.csv");

        // Displaying staff after loading from file
        System.out.println("Staff after loading from file:");
        for (Teacher t : school.getStaff()) {
            System.out.println(t);
        }

        // Display address and VAT number
        System.out.println("School Address: " + school.getAddress());
        System.out.println("School VAT Number: " + school.getVatNumber());
    }
}

