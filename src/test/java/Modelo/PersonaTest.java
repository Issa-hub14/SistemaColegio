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
        assertEquals("Juan", nuevoprofesor.getNombre());
    }

    @Test
    public void testGetDireccion() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals("Calle 1", nuevoprofesor.getDireccion());
    }

    @Test
    public void testGetTelefono() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals("123", nuevoprofesor.getTelefono());
    }

    @Test
    public void testGetFechaDeNacimiento() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertEquals(nuevaFecha, nuevoprofesor.getFechaDeNacimiento());
    }

    @Test
    public void testSetters() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        nuevoprofesor.setNombre("Carlos");
        nuevoprofesor.setDireccion("Calle 12");
        nuevoprofesor.setTelefono("111");
        assertEquals("Carlos", nuevoprofesor.getNombre());
        assertEquals("Calle 12", nuevoprofesor.getDireccion());
        assertEquals("111", nuevoprofesor.getTelefono());
    }

    @Test
    public void testToString() {
        Fecha nuevaFecha = new Fecha(10, 3, 1990);
        Persona nuevoprofesor = new Profesor("Juan", "Calle 1", "123", nuevaFecha, 12345, "Matemáticas", 50000, 80);
        assertTrue(nuevoprofesor.toString().contains("Juan"));
        assertTrue(nuevoprofesor.toString().contains("Calle 1"));
    }

}
