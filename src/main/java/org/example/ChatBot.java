package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome! How can I assist you today?");
            System.out.println("1. Get current weather");
            System.out.println("2. Get currency exchange rate");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the city name:");
                    String city = scanner.nextLine();
                    try {
                        String weather = WeatherService.getWeather(city);
                        System.out.println(weather);
                    } catch (IOException e) {
                        System.out.println("Error fetching weather data.");
                    }
                    break;
                case 2:
                    System.out.println("Enter the base currency (e.g., USD):");
                    String baseCurrency = scanner.nextLine();
                    System.out.println("Enter the target currency (e.g., EUR):");
                    String targetCurrency = scanner.nextLine();
                    try {
                        String rate = ExchangeRateService.getExchangeRate(baseCurrency, targetCurrency);
                        System.out.println(rate);
                    } catch (IOException e) {
                        System.out.println("Error fetching exchange rate data.");
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
