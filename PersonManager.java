package quizes.q3.luka_mkervalishvili_1;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {


    public static List<Checkinout> getPersons() {

        List<Checkinout> result= new ArrayList<>();

        String[] lines = Persons.Persons.split("\n");

        for (String line : lines) {
            String[] fields = line.split(",");

            String firstName = fields[0].trim();
            String lastName = fields[1].trim();
            String personalNumber = fields[2].trim();

            Checkinout p = new Checkinout();
            p.setId(personalNumber);
            p.setName(firstName);
            p.setSurname(lastName);

            result.add(p);

        }
        return result;
    }
}