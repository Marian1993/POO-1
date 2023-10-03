package org.example.PracticaNasa;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;

import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class NasaService {

    private final String key = "hPz3kslKsnnCv9Ki2SsGcJqRQSZbamBmIfLY1MaM";

    public List<Asteroide> getAsteroide(LocalDateTime avui,LocalDateTime ahir) throws IOException {

        connexio(key);

        JsonArray array = pasarArchivoAJsonArray();

        ArrayList<Asteroide> jasonArray = new Gson().fromJson(array.toString(), ArrayList.class);

        return jasonArray;
    }
    private JsonArray pasarArchivoAJsonArray() throws IOException {
        JsonArray asteroides = new JsonArray();
        String json;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\maria\\IdeaProjects\\POO-1\\src\\main\\java\\org\\example\\PracticaNasa\\JsonFile.txt"));

        while ((json = br.readLine()) != null){
            if(json != null && !json.isEmpty()){
                List<String> objecte = new ArrayList<String>();
                String[] split = json.split(",");
                for (int i = 0; i < split.length; i++) {

                    //System.out.println(split[i]);
                    if(split[i].contains("name")) {
                        objecte.add(split[i]);

                        objecte.forEach((n) -> System.out.println(n));
                    }

                }
            }
        }
        return asteroides;
    }



    private void connexio(String clau) throws IOException {
        URL url = new URL("https://api.nasa.gov/neo/rest/v1/feed?start_date=2023-10-02&end_date=2023-10-03&api_key=" + clau);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        File file = new File("C:\\Users\\maria\\IdeaProjects\\POO-1\\src\\main\\java\\org\\example\\PracticaNasa\\JsonFile.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        String outputLine = "";
        while ((inputLine = br.readLine()) != null){
            outputLine += inputLine;




            bw.write(outputLine);
            bw.close();

        }
        br.close();
        System.out.println(outputLine);
    }
}
