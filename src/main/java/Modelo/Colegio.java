/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class Colegio {

    private Profesor[] profesores;
    private Estudiante[] estudiantes;
    private int contadorProfesores;
    private int contadorEstudiantes;

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getContadorProfesores() {
        return contadorProfesores;
    }

    public void setContadorProfesores(int contadorProfesores) {
        this.contadorProfesores = contadorProfesores;
    }

    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }

    public void setContadorEstudiantes(int contadorEstudiantes) {
        this.contadorEstudiantes = contadorEstudiantes;
    }

    public Colegio(int capacidadProfesores, int capacidadEstudiantes) {
        this.profesores = new Profesor[capacidadProfesores];
        this.estudiantes = new Estudiante[capacidadEstudiantes];
        this.contadorProfesores = 0;
        this.contadorEstudiantes = 0;
    }

    public void agregarProfesor(Profesor nuevoProfesor) {
        if (contadorProfesores < profesores.length) {
            profesores[contadorProfesores] = nuevoProfesor;
            contadorProfesores++;
        }
    }

    public void agregarEstudiante(Estudiante nuevoEstudiante) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = nuevoEstudiante;
            contadorEstudiantes++;
        }
    }

    public String reporteEstudiantes() {
        String resultado = "-- LISTA DE ESTUDIANTES --\n";
        for (int i = 0; i < contadorEstudiantes; i++) {
            resultado += (i + 1) + ". " + estudiantes[i].toString() + "\n ------ \n";
        }
        return resultado;
    }

    private Profesor[] ordenarPorSalario() {
        Profesor[] profesoresOrdenados = new Profesor[contadorProfesores];
        for (int i = 0; i < contadorProfesores; i++) {
            profesoresOrdenados[i] = profesores[i];
        }
        for (int i = 0; i < contadorProfesores - 1; i++) {
            for (int j = 0; j < contadorProfesores - 1 - i; j++) {
                if (profesoresOrdenados[j].calcularSalarioTotal() < profesoresOrdenados[j + 1].calcularSalarioTotal()) {
                    Profesor temporal = profesoresOrdenados[j];
                    profesoresOrdenados[j] = profesoresOrdenados[j + 1];
                    profesoresOrdenados[j + 1] = temporal;
                }
            }
        }
        return profesoresOrdenados;
    }

    public String reporteProfesores() {
        Profesor[] profesoresOrdenados = ordenarPorSalario();
        String resultado = "-- LISTA DE PROFESORES --\n (De mayor a menor salario)\n";
        double totalPrestaciones = 0;
        for (int i = 0; i < contadorProfesores; i++) {
            resultado += (i + 1) + ". " + profesoresOrdenados[i].toString() + "\n ------ \n";
            totalPrestaciones += profesoresOrdenados[i].calcularPrestaciones();
        }
        resultado += "Total de prestaciones: " + totalPrestaciones;
        return resultado;
    }
    
    public String reporteProfesores(String area){
        Profesor[] profesoresOrdenados = ordenarPorSalario();
        String resultado = "-- LISTA DE PROFESORES DEL ÁREA: " + area.toUpperCase() + " --\n";
        int encontrados = 0;
        for (int i=0; i<contadorProfesores; i++){
            if(profesoresOrdenados[i].getArea().equalsIgnoreCase(area)){
                resultado+= (encontrados +1)+". "+ profesoresOrdenados[i].toString() +"\n ------ \n";
                encontrados++;
            }
        }
        if(encontrados==0){
            resultado += "No hay profesores en el área " + area;
        }
        return resultado;
    }
}
