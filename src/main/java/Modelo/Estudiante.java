/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Estudiante extends Persona {

    private String codigoEstudiante;
    private String grado;

    public Estudiante(String nombre, String direccion, String telefono, Fecha fechaDeNacimiento, 
            String codigoEstudiante, String grado) {
        super(nombre, direccion, telefono, fechaDeNacimiento);
        this.codigoEstudiante = codigoEstudiante;
        this.grado = grado;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Cargo: Estudiante"
                + " | Código: " + codigoEstudiante
                + " | Grado: " + grado;
    }
}
