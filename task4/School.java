package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class School implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Teacher> staff = new ArrayList<>();

    public School(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addTeacher(Teacher t) {
        staff.add(t);
    }

    public boolean deleteTeacher(Teacher t) {
        return staff.remove(t);
    }

    public void saveStaffToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Teacher teacher : staff) {
                writer.write(teacher.getName() + "," + teacher.getSurname() + "," + teacher.getEmployeeID());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadStaffFromFile(String filename) {
        staff.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Teacher teacher = new Teacher(parts[0], parts[1], parts[2]);
                    staff.add(teacher);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Teacher> getStaff() {
        return new ArrayList<>(staff); // Return a copy to avoid external modification
    }
}
