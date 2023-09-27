import org.example.model.Llista;
import org.example.model.Persona;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class LlistaTest<T> {

         public List<T> llista = new ArrayList<>();

    @Test
    public void afeguirPersones(){

        llista.add((T) new Persona("Tolo","Moroto",23));
        llista.add((T) new Persona("Clara","Gual",18));

    }
    @Test
    public void comprovacioDePersones(){

        if(llista.size() == 2){
            System.out.println("HI ha dues persones");
        }else {
            System.out.println("No hi ha 2 persones");
        }
    }

    @Test
    public void eliminarPersona(){

        llista.remove(0);
    }
    public static void main(String[] args) {
        LlistaTest<Persona> test = new LlistaTest<>();
        test.afeguirPersones();
        test.comprovacioDePersones();
        test.eliminarPersona();
        test.comprovacioDePersones();
    }
}
