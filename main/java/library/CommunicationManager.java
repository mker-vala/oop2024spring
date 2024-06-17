package library;

import java.util.ArrayList;
import java.util.List;

public class CommunicationManager {
    private List<ChatMessage> chatHistory = new ArrayList<>();

    public String sendMessageToChatbot(String message) {
        // Add the user message to chat history
        chatHistory.add(new ChatMessage("User", message));

        // Get the response from the dummy implementation
        String response = getDummyResponse(message);

        // Add chatbot response to chat history
        chatHistory.add(new ChatMessage("Chatbot", response));

        // Display all chat history
        displayChatHistory();

        return response;
    }

    private String getDummyResponse(String message) {
        // Simulate a response for testing
        switch (message.toLowerCase()) {
            case "hello":
                return "Good day";
            case "what time is it?":
                return "9:00 AM";
            case "i should go!":
                return "Wait for me!";
            default:
                return "I don't understand";
        }
    }

    private void displayChatHistory() {
        System.out.println();
        for (ChatMessage message : chatHistory) {
            System.out.println(message);
        }
        System.out.println();
    }
}
