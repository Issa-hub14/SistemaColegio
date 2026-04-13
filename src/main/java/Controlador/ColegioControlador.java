/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.Colegio;
import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.Profesor;
import Modelo.Fecha;

public class ColegioControlador {

    private Colegio colegio;

    public ColegioControlador() {
        this.colegio = new Colegio(20, 50);
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    private boolean esNumeroEntero(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean esNumeroDecimal(String texto) {
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        int puntos = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '.') {
                puntos++;
                if (puntos > 1) {
                    return false;
                }
            } else if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String agregarProfesor(String nombre, String direccion, String telefono,
            String diaStr, String mesStr, String anioStr,
            String cedulaStr, String area, String salarioHoraStr, String horasMesStr) {

        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || area.isEmpty()) {
            return "Error: todos los campos son obligatorios.";
        }
        if (!esNumeroEntero(diaStr) || !esNumeroEntero(mesStr) || !esNumeroEntero(anioStr)) {
            return "Error: la fecha debe contener solo números.";
        }
        if (!esNumeroEntero(cedulaStr)) {
            return "Error: la cédula debe contener solo números.";
        }
        if (!esNumeroDecimal(salarioHoraStr)) {
            return "Error: el salario debe ser un número válido.";
        }
        if (!esNumeroEntero(horasMesStr)) {
            return "Error: las horas deben ser un número entero.";
        }
        
        int dia = Integer.parseInt(diaStr);
        int mes = Integer.parseInt(mesStr);
        int anio = Integer.parseInt(anioStr);

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900) {
            return "Error: fecha inválida.";
        }
        int anioActual = 2026;
        if ((anioActual - anio) < 18) {
            return "Error: el profesor debe ser mayor de edad.";
        }
        int cedula= Integer.parseInt(cedulaStr);
        double salarioHora = Double.parseDouble(salarioHoraStr);
        int horasMes = Integer.parseInt(horasMesStr);

        Fecha nuevaFecha = new Fecha(dia, mes, anio);
        Profesor nuevoProfesor = new Profesor(nombre, direccion, telefono, nuevaFecha, cedula, area, salarioHora, horasMes);
        colegio.agregarProfesor(nuevoProfesor);

        return "Profesor(a) " + nombre + " agregad@ correctamente.";
    }
}
