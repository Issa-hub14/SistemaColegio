/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class FechaTest {
    
    public FechaTest() {
    }
    
     @Test
    public void testFecha() {
        Fecha nuevaFecha = new Fecha(15, 6, 2000);
        assertEquals(15, nuevaFecha.getDia(), "Fallo en el test");
        assertEquals(6, nuevaFecha.getMes(), "Fallo en el test");
        assertEquals(2000, nuevaFecha.getAnio(), "Fallo en el test");
    }

    @Test
    public void testSetters() {
        Fecha nuevaFecha = new Fecha(1, 1, 2000);
        nuevaFecha.setDia(20);
        nuevaFecha.setMes(12);
        nuevaFecha.setAnio(1999);
        assertEquals(20, nuevaFecha.getDia(), "Fallo en el test2");
        assertEquals(12, nuevaFecha.getMes(), "Fallo en el test2");
        assertEquals(1999, nuevaFecha.getAnio(), "Fallo en el test2");
    }

    @Test
    public void testToString() {
        Fecha nuevaFecha = new Fecha(1, 1, 2000);
        assertEquals("1/1/2000", nuevaFecha.toString(), "Fallo en el test3");
    }

    
}
