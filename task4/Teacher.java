package finalexam.task4;

import java.io.Serializable;

public class Teacher implements Serializable {
    private String name;
    private String surname;
    private String employeeID;

    public Teacher(String name, String surname, String employeeID) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Teacher [Name=" + name + ", Surname=" + surname + ", Employee ID=" + employeeID + "]";
    }
}
