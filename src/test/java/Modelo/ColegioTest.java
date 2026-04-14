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
public class ColegioTest {

    public ColegioTest() {
    }

    @Test
    public void testAgregarProfesor() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 1980);
        Profesor nuevoProfesor = new Profesor("Juan", "Calle 5", "111", nuevaFecha, 22222, "Historia", 30000, 60);
        c.agregarPersona(nuevoProfesor);
        assertEquals(1, c.getContadorProfesores(), "Fallo en el test");
    }

    @Test
    public void testAgregarEstudiante() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 2006);
        Estudiante nuevoEstudiante = new Estudiante("Sofia", "Calle 6", "222", nuevaFecha, "1-B", "9B");
        c.agregarPersona(nuevoEstudiante);
        assertEquals(1, c.getContadorEstudiantes(), "Fallo en el test2");
    }

    @Test
    public void testCedulaDuplicada() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 1980);
        Profesor profesor1 = new Profesor("Pedro", "Calle 5", "111", nuevaFecha, 22222, "Historia", 30000, 60);
        Profesor profesor2 = new Profesor("Pablo", "Calle 7", "333", nuevaFecha, 22222, "Física", 35000, 70);
        c.agregarPersona(profesor1);
        c.agregarPersona(profesor2);
        assertEquals(1, c.getContadorProfesores(), "Fallo en el test3");
    }

    @Test
    public void testCodigoDuplicado() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 2006);
        Estudiante estudiante1 = new Estudiante("Sofia", "Calle 6", "222", nuevaFecha, "2-B", "9B");
        Estudiante estudiante2 = new Estudiante("Laura", "Calle 8", "444", nuevaFecha, "2-B", "10B");
        c.agregarPersona(estudiante1);
        c.agregarPersona(estudiante2);
        assertEquals(1, c.getContadorEstudiantes(), "Fallo en el test4");
    }

    @Test
    public void testReporteEstudiantes() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 2006);
        Estudiante estudiante1 = new Estudiante("Sofia", "Calle 6", "222", nuevaFecha, "2-B", "9B");
        c.agregarPersona(estudiante1);
        String resultado = c.reporteEstudiantes();
        assertTrue(resultado.contains("ESTUDIANTES"), "Fallo en el test5");
        assertTrue(resultado.contains("Grado"), "Fallo en el test5");
    }

    @Test
    public void testReporteProfesores_0args() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 1980);
        Profesor profesor1 = new Profesor("Ana", "Calle 1", "111", nuevaFecha, 11111, "Arte", 10000, 10);
        Profesor profesor2 = new Profesor("Luis", "Calle 2", "222", nuevaFecha, 22222, "Ciencias", 20000, 10);
        c.agregarPersona(profesor1);
        c.agregarPersona(profesor2);
        String reporte = c.reporteProfesores();

        assertTrue(reporte.indexOf("Luis") < reporte.indexOf("Ana"));
    }

    @Test
    public void testReporteProfesores_String() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 1980);
        Profesor profesor1 = new Profesor("Ana", "Calle 1", "111", nuevaFecha, 11111, "Arte", 10000, 10);
        Profesor profesor2 = new Profesor("Luis", "Calle 2", "222", nuevaFecha, 22222, "Ciencias", 20000, 10);
        c.agregarPersona(profesor1);
        c.agregarPersona(profesor2);
        String reporte = c.reporteProfesores("Arte");
        assertTrue(reporte.contains("Ana"), "Fallo en el test7");
        assertFalse(reporte.contains("Luis"), "Fallo en el test7");
    }

    @Test
    public void testTotalPrestaciones() {
        Colegio c = new Colegio(5, 5);
        Fecha nuevaFecha = new Fecha(1, 1, 1980);
        Profesor profesor1 = new Profesor("Ana", "Calle 1", "111", nuevaFecha, 11111, "Arte", 1000, 10);
        Profesor profesor2 = new Profesor("Luis", "Calle 2", "222", nuevaFecha, 22222, "Ciencias", 2000, 10);
        c.agregarPersona(profesor1);
        c.agregarPersona(profesor2);
        String reporte = c.reporteProfesores();
    
        assertTrue(reporte.contains("7410"), "Fallo en el test8");
    }

}
