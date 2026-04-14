/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.Colegio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class ColegioControladorIT {

    public ColegioControladorIT() {
    }

    @Test
    public void testAgregarProfesor() {
        ColegioControlador controlador = new ColegioControlador();
        String resultado = controlador.agregarProfesor("Juan", "Calle 1", "555", "10", "5", "1985", "33333", "Química", "25000", "90");
        assertEquals("Profesor(a) Juan agregad@ correctamente.", resultado, "Fallo en el test");
    }

    @Test
    public void testAgregarEstudiante() {
        ColegioControlador controlador = new ColegioControlador();
        String resultado = controlador.agregarEstudiante("Diana", "Av 2", "666", "15", "8", "2007", "3-C", "8C");
        assertEquals("Estudiante Diana agregad@ correctamente.", resultado, "Fallo en el test2");
    }

    @Test
    public void testObtenerReporteProfesores() {
        ColegioControlador controlador = new ColegioControlador();
        controlador.agregarProfesor("Juan", "Calle 1", "555", "10", "5", "1985", "33333", "Química", "25000", "90");
        String resultado = controlador.obtenerReporteProfesores();
        assertTrue(resultado.contains("Juan"), "Fallo en el test3");
        assertTrue(resultado.contains("Química"), "Fallo en el test3");
    }

    @Test
    public void testObtenerReporteProfesoresPorArea() {
        ColegioControlador controlador = new ColegioControlador();
        controlador.agregarProfesor( "Juan", "Calle 1", "555", "10", "5", "1985", "33333", "Química", "25000", "90");
        controlador.agregarProfesor( "Ana", "Av 2", "666", "1", "1", "1980",  "44444", "Arte", "20000", "80");
        String resultado = controlador.obtenerReporteProfesoresPorArea("Química");
        assertTrue(resultado.contains("Juan"), "Fallo en el test4");
        assertFalse(resultado.contains("Ana"), "Fallo en el test4");
    }

    @Test
    public void testObtenerReporteEstudiantes() {
        ColegioControlador controlador = new ColegioControlador();
        controlador.agregarEstudiante("Diana", "Av 2", "666","15", "8", "2007","3-c", "8C");
        String resultado = controlador.obtenerReporteEstudiantes();
        assertTrue(resultado.contains("Diana"), "Fallo en el test5");
        assertTrue(resultado.contains("3-c"), "Fallo en el test5");
    }

}
