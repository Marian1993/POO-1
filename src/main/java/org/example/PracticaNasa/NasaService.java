package org.example.PracticaNasa;


import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.util.List;


public class NasaService {

    private String clave = "hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM";

    public List<Asteroide> getAsteroide(LocalDateTime avui,LocalDateTime ahir) throws IOException {
        connexio("buid");
        return null;
    }

    private void connexio(String api) throws IOException {
        URL url = new URL("https://api.nasa.gov/neo/rest/v1/feed?start_date=2023-10-02&end_date=2023-10-03&api_key=hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        String outputLine = "";
        while ((inputLine = in.readLine()) != null){
            outputLine += inputLine;
        }
        in.close();
        System.out.println(outputLine);
    }
}
