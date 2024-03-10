import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        int minutes = scanner.nextInt();

        scanner.close();

        int seconds = minutes * 60;

        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }
}


