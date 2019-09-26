package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = new Dato("Dato001", new Object());
        BaseDeDatos instance = new BaseDeDatos();
        instance.agregar(dato);
        boolean esperado = true;
        dato = new Dato("Dato002", new Object());
        boolean obtenido = instance.modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
