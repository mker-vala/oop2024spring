package org.example;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WeatherService {
    private static final String API_KEY = "https://openweathermap.org ";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";

    public static String getWeather(String city) throws IOException {
        String urlString = BASE_URL + city + "&appid=" + API_KEY + "&units=metric";
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            StringBuilder inline = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                inline.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject data = new JSONObject(inline.toString());
            return parseWeatherData(data);
        }
    }

    private static String parseWeatherData(JSONObject data) {
        String city = data.getString("name");
        JSONObject main = data.getJSONObject("main");
        double temperature = main.getDouble("temp");
        return "The current temperature in " + city + " is " + temperature + "°C.";
    }
}

