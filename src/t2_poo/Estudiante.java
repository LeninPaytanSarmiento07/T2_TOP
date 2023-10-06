/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2_poo;

/**
 *
 * @author Lenin
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String asistencia;

    public Estudiante(String nombre, String apellido, String asistencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asistencia = asistencia;
    }

    public String getEstudiante() {
        return nombre + " " + apellido + " " + asistencia; 
    }

}

