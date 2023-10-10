package org.example.PracticaNasa.Fonts;

import org.example.PracticaNasa.Asteroides.Asteroide;

import java.io.IOException;
import java.util.List;

public interface FontsI {

    List<Asteroide> getAsteroide(/*LocalDateTime avui, LocalDateTime ahir*/) throws IOException;

}
