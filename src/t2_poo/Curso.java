/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2_poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenin
 */
public class Curso {
    private String nombre;
    private int capacidad;
    private List<Estudiante> listaEstudiantes;

    public Curso(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.listaEstudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {
        if (listaEstudiantes.size() < capacidad) {
            listaEstudiantes.add(estudiante);
            return true;
        } else {
            return false; // El aula está llena
        }
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }
}
