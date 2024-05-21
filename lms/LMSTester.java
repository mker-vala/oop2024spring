package lms;

public class LMSTester {
    public static void main(String[] args) {
        // Create a library instance
        LMS iliauniLibrary = new LMS();

        // Add some books to the library
        Book lor = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book oop = new Book("OOP", "Paata Gogishvili");
        iliauniLibrary.addBook(lor);
        iliauniLibrary.addBook(oop);

        // Create some students
        Student gocha = new Student("Gocha", "Gegeshidze", "12345");
        Student maka = new Student("Maka", "Lobjanidze", "54321");

        // Test borrowing and returning books
        iliauniLibrary.borrowBook(lor, gocha);
        iliauniLibrary.borrowBook(oop, maka);
        iliauniLibrary.returnBook(lor);

        // Test saving and loading library state
        iliauniLibrary.saveState("libraryState.txt");
        iliauniLibrary.loadState("libraryState.txt");
    }
}
