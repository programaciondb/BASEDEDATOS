package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "Dato001";
        Dato dato = new Dato("Dato001", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        boolean obtenido = instance.eliminar(id);
        Assert.assertEquals(esperado, obtenido);
    }
}
