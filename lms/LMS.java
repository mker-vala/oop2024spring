package lms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LMS implements Serializable {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(Book book) {
        boolean removed = books.remove(book);
        if (removed) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
        return removed;
    }

    public boolean borrowBook(Book book, Student student) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println(student.getName() + " borrowed: " + book.getTitle());
            return true;
        } else {
            System.out.println("Book not available: " + book.getTitle());
            return false;
        }
    }

    public boolean returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
        return true;
    }

    public void saveState(String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(books);
            System.out.println("Library state saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while saving library state.");
        }
    }

    @SuppressWarnings("unchecked")
    public boolean loadState(String filePath) {
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            books = (List<Book>) in.readObject();
            System.out.println("Library state loaded successfully.");
            return true;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error occurred while loading library state.");
            return false;
        }
    }
}
