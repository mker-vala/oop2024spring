package quiz5;

import library.CommunicationManager;
import java.util.Scanner;

public class UsrInteractionManager {
    private CommunicationManager communicationManager;
    private Scanner scanner;

    public UsrInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
        this.scanner = new Scanner(System.in);
    }

    public void startInteraction() {
        System.out.println("Chatbot is ready. Type 'exit' to end the conversation.");

        while (true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userMessage)) {
                System.out.println("Ending chat. Goodbye!");
                break;
            }

            // Send the user message to the chatbot and get the response
            String response = communicationManager.sendMessageToChatbot(userMessage);
            System.out.println("Chatbot: " + response);
        }
    }

    public void interactWithUser(String message) {
        String response = communicationManager.sendMessageToChatbot(message);
        System.out.println("Chatbot: " + response);
    }
}
