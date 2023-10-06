/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2_poo;

/**
 *
 * @author Lenin
 */
public class T2_POO {

    /**
     * @param args the command line arguments
     */
    private static Curso cursoManana;
    private static Curso cursoTarde;
    private static Curso cursoNoche;
    
    public static void main(String[] args) {
        cursoManana = new Curso("Clase de Trigonometría", 10);
        cursoTarde = new Curso("Clase de Geometría", 10);
        cursoNoche = new Curso("Clase de Álgebra", 10);
    }
    
}
