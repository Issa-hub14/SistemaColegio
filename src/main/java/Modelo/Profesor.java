/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Profesor extends Persona {

    private int cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, Fecha fechaDeNacimiento,
            int cedula, String area, double salarioHora, int horasMes) {

        super(nombre, direccion, telefono, fechaDeNacimiento);

        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public double calcularSalarioTotal() {
        double salarioBase = salarioHora * horasMes;
        double salarioTotal = salarioBase + (salarioBase * 0.30);
        return salarioTotal;
    }

    public double calcularPrestaciones() {
        double prestaciones = calcularSalarioTotal() * 0.19;
        return prestaciones;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Cargo: Profesor"
                + " | Cédula: " + cedula
                + " | Área: " + area
                + " | Salario total: " + calcularSalarioTotal()
                + " | Prestaciones: " + calcularPrestaciones();
    }
}
