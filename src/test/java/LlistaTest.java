
import org.example.model.CuaPersona;
import org.example.model.Persona;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LlistaTest {
    private CuaPersona cua;


    @Before
    public void setUp() {
        cua = new CuaPersona();
    }

    @Test
    public void testAdd() {
        cua.add(new Persona("Tolo","Moroto",23));
        cua.add(new Persona("Clara","Gual",18));
        assertEquals(2, cua.list());
    }

    @Test
    public void testRemove() {
        cua.add(new Persona("Tolo","Moroto",23));
        cua.add(new Persona("Clara","Gual",18));
        cua.remove();
        assertEquals(1, cua.list());
    }
    @Test
    public void testRemoveMoreThanCapable() {
        cua.add(new Persona("Tolo","Moroto",23));
        cua.add(new Persona("Clara","Gual",18));
        cua.remove();
        cua.remove();
        cua.remove();
        assertEquals(0, cua.list());
    }



    @Test
    public void testList() {
        assertEquals(0, cua.list());
        cua.add(new Persona("Tolo","Moroto",23));
        assertEquals(1, cua.list());
    }
}