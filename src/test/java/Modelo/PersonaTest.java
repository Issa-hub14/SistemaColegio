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
public class PersonaTest {

    public PersonaTest() {
    }

    @Test
    public void testGetNombre() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals("Juan", nuevoprofesor.getNombre(), "Fallo en el test");
    }

    @Test
    public void testGetDireccion() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals("Calle 1", nuevoprofesor.getDireccion(), "Fallo en el test2");
    }

    @Test
    public void testGetTelefono() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals("123", nuevoprofesor.getTelefono(), "Fallo en el test3");
    }

    @Test
    public void testGetFechaDeNacimiento() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals(nuevaFecha, nuevoprofesor.getFechaDeNacimiento(), "Fallo en el test4");
    }

    @Test
    public void testSetters() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        nuevoprofesor.setNombre("Carlos");
        nuevoprofesor.setDireccion("Calle 12");
        nuevoprofesor.setTelefono("111");
        assertEquals("Carlos", nuevoprofesor.getNombre(), "Fallo en el test5");
        assertEquals("Calle 12", nuevoprofesor.getDireccion(), "Fallo en el test5");
        assertEquals("111", nuevoprofesor.getTelefono(), "Fallo en el test5");
    }

    @Test
    public void testToString() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertTrue(nuevoprofesor.toString().contains("Juan"), "Fallo en el test6");
        assertTrue(nuevoprofesor.toString().contains("Calle 1"), "Fallo en el test6");
    }

}
