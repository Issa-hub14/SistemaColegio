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
public class EstudianteTest {

    public EstudianteTest() {
    }

    @Test
    public void testGetCodigoEstudiante() {
        Fecha nuevafecha = new Fecha(5, 5, 2005);
        Estudiante nuevoEstudiante = new Estudiante("Maria", "Calle 4", "321", nuevafecha, "1-A", "10A");
        assertEquals("1-A", nuevoEstudiante.getCodigoEstudiante(), "Fallo en el test");
    }

    @Test
    public void testGetGrado() {
        Fecha nuevafecha = new Fecha(5, 5, 2005);
        Estudiante nuevoEstudiante = new Estudiante("Maria", "Calle 4", "321", nuevafecha, "1-A", "10A");
        assertEquals("10A", nuevoEstudiante.getGrado(), "Fallo en el test2");
    }
    
    @Test
    public void testSetters() {
        Fecha nuevafecha = new Fecha(5, 5, 2005);
        Estudiante nuevoEstudiante = new Estudiante("Maria", "Calle 4", "321", nuevafecha, "1-A", "10A");
        nuevoEstudiante.setCodigoEstudiante("9-B");
        nuevoEstudiante.setGrado("11B");
        assertEquals("9-B", nuevoEstudiante.getCodigoEstudiante(),"Fallo en el test3");
        assertEquals("11B", nuevoEstudiante.getGrado(),"Fallo en el test3");
    }

    @Test
    public void testToString() {
        Fecha nuevafecha = new Fecha(5, 5, 2005);
        Estudiante nuevoEstudiante = new Estudiante("Maria", "Calle 4", "321", nuevafecha, "1-A", "10A");
        assertTrue(nuevoEstudiante.toString().contains("Estudiante"), "Fallo en el test4");
        assertTrue(nuevoEstudiante.toString().contains("1-A"), "Fallo en el test4");
        assertTrue(nuevoEstudiante.toString().contains("10A"), "Fallo en el test4");
    }
   

}
