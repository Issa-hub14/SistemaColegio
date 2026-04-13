/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Persona {
    protected String nombre; 
    protected String direccion;
    protected String telefono;
    protected Fecha fechaDeNacimiento;
    
    public Persona(String nombre, String direccion, String telefono, Fecha fechaDeNacimiento){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\n Dirección: " + direccion +
               "\n Teléfono: " + telefono +
               "\n Fecha de nacimiento: " + fechaDeNacimiento;
    }
}
