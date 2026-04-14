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
public class ProfesorTest {

    public ProfesorTest() {
    }

    @Test
    public void testGetCedula() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 40000, 100);
        assertEquals(22500, nuevoprofesor.getCedula(), "Fallo en el test");
    }

    @Test
    public void testGetArea() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 40000, 100);
        assertEquals("Ciencias", nuevoprofesor.getArea(),"Fallo en el test2");
    }

    @Test
    public void testGetSalarioHora() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 40000, 100);
        assertEquals(40000, nuevoprofesor.getSalarioHora(), 0.01, "Fallo en el test3");
    }

    @Test
    public void testGetHorasMes() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 40000, 100);
        assertEquals(100, nuevoprofesor.getHorasMes(),"Fallo en el test4");
    }

    @Test
    public void testSetters() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 40000, 100);
        nuevoprofesor.setCedula(11111);
        nuevoprofesor.setArea("Física");
        nuevoprofesor.setSalarioHora(60000);
        nuevoprofesor.setHorasMes(120);
        assertEquals(11111, nuevoprofesor.getCedula(), "Fallo en el test5");
        assertEquals("Física", nuevoprofesor.getArea(),"Fallo en el test5");
        assertEquals(60000, nuevoprofesor.getSalarioHora(), 0.01,"Fallo en el test5");
        assertEquals(120, nuevoprofesor.getHorasMes(),"Fallo en el test5");
    }

    @Test
    public void testCalcularSalarioTotal() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 10000, 10);

        assertEquals(130000, nuevoprofesor.calcularSalarioTotal(), 0.01, "Fallo en el test6");
    }

    @Test
    public void testCalcularPrestaciones() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 10000, 10);
        assertEquals(24700, nuevoprofesor.calcularPrestaciones(), 0.01, "Fallo en el test7");
    }

    @Test
    public void testToString() {
        Fecha nuevafecha = new Fecha(1, 1, 1985);
        Profesor nuevoprofesor = new Profesor("Ana", "Calle 2", "318456", nuevafecha, 22500, "Ciencias", 10000, 10);
        assertTrue(nuevoprofesor.toString().contains("Profesor"),"Fallo en el test8");
        assertTrue(nuevoprofesor.toString().contains("Ana"),"Fallo en el test8");
        assertTrue(nuevoprofesor.toString().contains("Ciencias"), "Fallo en el test8");
    }
}
