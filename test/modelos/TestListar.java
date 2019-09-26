package modelos;

import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }

    @Test
    public void testListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList<Dato> esperado = new ArrayList<>();
        ArrayList<Dato> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
        
    }

}
