package finalexam.task5;

public class CommunicationTester {
    public static void main(String[] args) {
        String endpoint = "https://example.com/api/sendMessage"; // Replace with your actual endpoint
        CommunicationManager cm = new CommunicationManager(endpoint);

        String response = cm.sendUserMessage("Hello, this is a test message!");
        System.out.println(response);
    }
}
