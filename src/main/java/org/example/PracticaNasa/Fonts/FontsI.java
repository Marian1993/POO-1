package org.example.PracticaNasa.Fonts;

import org.example.PracticaNasa.Asteroides.Asteroide;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public interface FontsI {

    List<Asteroide> getAsteroide(LocalDateTime fetxaActual) throws IOException;

}
