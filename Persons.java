package quizes.q3.luka_mkervalishvili_1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Persons {
    public static final String Persons = "Liam,Oakley,1357924680\n" +
            "Noah,Patel,2468013579\n" +
            "Oliver,Quinn,3579135792\n" +
            "Elijah,Riley,4680246801\n" +
            "William,Sawyer,5791357913\n" +
            "James,Taylor,6802468024\n" +
            "Benjamin,Turner,7913579135\n" +
            "Lucas,Vaughan,8024680246\n" +
            "Henry,Walker,9135791357\n" +
            "Alexander,Xander,0246802468\n" +
            "Mason,Yakovich,1357913579\n" +
            "Michael,Zimmerman,2468024680\n" +
            "Ethan,Adams,3579135791\n" +
            "Daniel,Baker,4680246802\n" +
            "Jacob,Carter,5791357913\n" +
            "Logan,Davis,6802468024\n" +
            "Jackson,Evans,7913579135\n" +
            "Levi,Foster,8024680246\n" +
            "Sebastian,Gonzalez,9135791357\n" +
            "Mateo,Harris,0246802468\n" +
            "Jack,Irwin,1357913579\n" +
            "Owen,Jackson,2468024680\n" +
            "Theodore,King,3579135791\n" +
            "Aiden,Lopez,4680246802\n" +
            "Samuel,Morris,5791357913\n" +
            "Joseph,Nguyen,6802468024\n" +
            "John,O'Brien,7913579135\n" +
            "David,Peterson,8024680246\n" +
            "Wyatt,Quinlan,9135791357\n" +
            "Matthew,Robinson,0246802468\n" +
            "Luke,Silva,1357913579\n" +
            "Asher,Thompson,2468024680\n" +
            "Carter,Underwood,3579135791\n" +
            "Julian,Valdez,4680246802\n" +
            "Grayson,Washington,5791357913\n" +
            "Leo,Xavier,6802468024\n" +
            "Jayden,Young,7913579135\n" +
            "Gabriel,Zimmerman,8024680246\n" +
            "Isaac,Anderson,9135791357\n" +
            "Lincoln,Brown,0246802468\n" +
            "Anthony,Collins,1357913579\n" +
            "Hudson,Edwards,2468024680\n" +
            "Dylan,Ford,3579135791\n" +
            "Ezra,Gonzalez,4680246802\n" +
            "Thomas,Hughes,5791357913\n" +
            "Charles,Jenkins,6802468024\n" +
            "Christopher,Lawrence,7913579135\n" +
            "Jaxon,Mills,8024680246\n" +
            "Maverick,Nelson,9135791357\n" +
            "Josiah,Owens,0246802468\n" +
            "Isaiah,Parker,1357913579\n" +
            "Andrew,Quinn,2468024680\n" +
            "Elias,Richardson,3579135791\n" +
            "Joshua,Simmons,4680246802\n" +
            "Nathan,Thompson,5791357913\n" +
            "Caleb,Vargas,6802468024\n" +
            "Ryan,Washington,7913579135\n" +
            "Adrian,Young,8024680246\n" +
            "Miles,Adams,9135791357\n" +
            "Eli,Baker,0246802468\n" +
            "Nolan,Carter,1357913579\n" +
            "Christian,Davis,2468024680\n" +
            "Aaron,Evans,3579135791\n" +
            "Cameron,Foster,4680246802\n" +
            "Ezekiel,Gonzalez,5791357913\n" +
            "Colton,Harris,6802468024\n" +
            "Luca,Irwin,7913579135\n" +
            "Landon,Jackson,8024680246\n" +
            "Hunter,King,9135791357\n" +
            "Jonathan,Lopez,0246802468\n" +
            "Santiago,Morris,1357913579\n" +
            "Axel,Nguyen,2468024680\n" +
            "Easton,O'Brien,3579135791\n" +
            "Cooper,Peterson,4680246802\n" +
            "Jeremiah,Quinlan,5791357913\n" +
            "Angel,Robinson,6802468024\n" +
            "Roman,Silva,7913579135\n" +
            "Connor,Thompson,8024680246\n" +
            "Jameson,Underwood,9135791357\n" +
            "Robert,Valdez,0246802468\n" +
            "Greyson,Washington,1357913579\n" +
            "Jordan,Xavier,2468024680\n" +
            "Ian,Young,3579135791\n" +
            "Carson,Zimmerman,4680246802\n" +
            "Jared,Anderson,5791357913\n" +
            "Ashton,Brown,6802468024\n" +
            "Declan,Collins,7913579135\n" +
            "Evan,Edwards,8024680246\n" +
            "Kayden,Ford,9135791357\n" +
            "Parker,Gonzalez,0246802468\n" +
            "Wesley,Hughes,1357913579\n" +
            "Kai,Jenkins,2468024680\n" +
            "Brayden,Lawrence,3579135791\n" +
            "Bryson,Mills,4680246802\n" +
            "Weston,Nelson,5791357913\n" +
            "Jason,Owens,6802468024\n" +
            "Emmett,Parker,7913579135\n" +
            "Sawyer,Quinn,8024680246\n" +
            "Silas,Richardson,9135791357\n" +
            "Bennett,Simmons,0246802468\n" +
            "Brooks,Thompson,1357913579\n" +
            "Micah,Vargas,2468024680\n" +
            "Damian,Washington,3579135791\n" +
            "Harrison,Young,4680246802\n" +
            "Waylon,Adams,5791357913\n" +
            "Ayden,Baker,6802468024\n" +
            "Vincent,Carter,7913579135\n" +
            "Ryder,Davis,8024680246\n" +
            "Kingston,Evans,9135791357\n" +
            "Dominic,Foster,0246802468\n" +
            "Austin,Gonzalez,1357913579";

    private static class Person {
        private String firstName;
        private String lastName;
        private boolean isCheckedIn;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.isCheckedIn = false;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public boolean isCheckedIn() {
            return isCheckedIn;
        }

        public void checkIn() {
            if (!isCheckedIn) {
                isCheckedIn = true;
                System.out.println(getFullName() + " has checked in.");
            } else {
                System.out.println(getFullName() + " is already checked in.");
            }
        }

        public void checkOut() {
            if (isCheckedIn) {
                isCheckedIn = false;
                System.out.println(getFullName() + " has checked out.");
            } else {
                System.out.println(getFullName() + " is already checked out.");
            }
        }
    }

    private static List<Person> personsList = new ArrayList<>();

    static {
        String[] personsData = Persons.split("\n");
        for (String personData : personsData) {
            String[] personInfo = personData.split(",");
            Person person = new Person(personInfo[0], personInfo[1]);
            personsList.add(person);
        }
    }

    public static void checkIn(String firstName, String lastName) {
        for (Person person : personsList) {
            if (person.firstName.equals(firstName) && person.lastName.equals(lastName)) {
                person.checkIn();
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public static void checkOut(String firstName, String lastName) {
        for (Person person : personsList) {
            if (person.firstName.equals(firstName) && person.lastName.equals(lastName)) {
                person.checkOut();
                return;
            }
        }
        System.out.println("Person not found.");
    }
}

