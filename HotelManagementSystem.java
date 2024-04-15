package quizes.q3.luka_mkervalishvili_1;

public class HotelManagementSystem {
    private static class Person {
        private String firstName;
        private String lastName;
        private String roomNumber;

        public Person(String firstName, String lastName, String roomNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.roomNumber = roomNumber;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public String getRoomNumber() {
            return roomNumber;
        }
    }

    private Map<String, Person> guestMap;

    public HotelManagementSystem() {
        this.guestMap = new HashMap<>();
    }

    public void addGuest(String id, String firstName, String lastName, String roomNumber) {
        guestMap.put(id, new Person(firstName, lastName, roomNumber));
    }

    public void displayInfo() {
        System.out.println("Guest Information:");
        for (Map.Entry<String, Person> entry : guestMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getFullName() + ", Room Number: " + entry.getValue().getRoomNumber());
        }
    }

    public static void main(String[] args) {
        HotelManagementSystem hms = new HotelManagementSystem();
        hms.addGuest("1", "John", "Doe", "101");
        hms.addGuest("2", "Jane", "Smith", "102");
        hms.addGuest("3", "Alice", "Johnson", "103");

        hms.displayInfo();
    }
}