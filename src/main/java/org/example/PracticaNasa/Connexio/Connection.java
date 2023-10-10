package org.example.PracticaNasa.Connexio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {

    public static String connexio(String api) throws IOException {
        URL url = new URL(api);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        String outputLine = "";
        while ((inputLine = br.readLine()) != null){
            outputLine += inputLine;

        }
        br.close();
        return outputLine;
    }
}
