package org.example;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ExchangeRateService {
    private static final String API_KEY = "https://www.exchangerate-api.com\n";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static String getExchangeRate(String baseCurrency, String targetCurrency) throws IOException {
        String urlString = BASE_URL + baseCurrency;
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
            return parseExchangeRate(data, targetCurrency);
        }
    }

    private static String parseExchangeRate(JSONObject data, String targetCurrency) {
        JSONObject rates = data.getJSONObject("conversion_rates");
        double rate = rates.getDouble(targetCurrency);
        return "The exchange rate from " + data.getString("base_code") + " to " + targetCurrency + " is " + rate + ".";
    }
}
