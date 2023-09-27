import org.example.model.Llista;
import org.example.model.Persona;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class LlistaTest {

        static List<Object> llista = new ArrayList<>();


    @Test
    public void afeguirPersones(){

        llista.add(new Persona("Tolo","Moroto",23));
        llista.add(new Persona("Clara","Gual",18));

    }

    @Test
    public void comprovacioDePersones(){

        if(llista.size() == 2){
            System.out.println("HI ha dues persones");
        }else {
            System.out.println("No hi ha 2 persones");
        }
    }

}
