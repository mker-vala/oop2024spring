package finalexam.task5;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CommunicationManager {

    private String endpoint;

    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
    }

    public String sendUserMessage(String message) {
        HttpURLConnection connection = null;
        try {
            // Create the URL object
            URL url = new URL(endpoint);
            System.out.println("URL: " + url);

            // Open connection
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Create the JSON message
            String jsonInputString = "{\"message\": \"" + message + "\"}";
            System.out.println("JSON Input: " + jsonInputString);

            // Write the JSON message to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Get the response code
            int code = connection.getResponseCode();
            System.out.println("Response Code: " + code);

            // Read the response
            StringBuilder response = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
            }
            System.out.println("Response: " + response.toString());

            if (code == HttpURLConnection.HTTP_OK) {
                return "Message sent successfully. Response: " + response.toString();
            } else {
                return "Failed to send message. Response code: " + code + ". Response: " + response.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "An error occurred: " + e.getMessage();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
