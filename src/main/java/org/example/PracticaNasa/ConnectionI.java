package org.example.PracticaNasa;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public interface ConnectionI {

    List<Asteroide> getAsteroide(LocalDateTime avui, LocalDateTime ahir) throws IOException;

    private String connexio(String api) {
        return null;
    }
}
