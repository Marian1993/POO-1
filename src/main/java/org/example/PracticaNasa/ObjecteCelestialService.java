package org.example.PracticaNasa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjecteCelestialService <T extends ObjecteCelestial>{

    private ConnectionI font;


    public ObjecteCelestialService(ConnectionI font){
        this.font = font;
    }

    public float getMax(){
        return 0;
    }
    public float getMin(){
        return 0;
    }

    public List<T> getPerillos() throws IOException {

        List<T> aPerillosos = (List<T>) this.font.getAsteroide();

        return aPerillosos.stream().filter(oc -> oc.isPerillos()).toList();
    }
}
