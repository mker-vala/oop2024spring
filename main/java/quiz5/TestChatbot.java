package quiz5;

import library.CommunicationManager;
import library.DummyCommunicationManager;

public class TestChatbot {
    public static void main(String[] args) {
        CommunicationManager communicationManager = new DummyCommunicationManager();
        UsrInteractionManager interactionManager = new UsrInteractionManager(communicationManager);


        interactionManager.startInteraction();


        // interactionManager.interactWithUser("Hello");
        // interactionManager.interactWithUser("What time is it?");
        // interactionManager.interactWithUser("I should go!");
    }
}

