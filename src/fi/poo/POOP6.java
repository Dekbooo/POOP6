/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase principal {@code POOP6} para crear y mostrar objetos de la clase {@link Coche}.
 * Ejecuta el programa imprimiendo "Hola mundo" y luego dos instancias de {@code Coche}.
 * 
 * @author poo03alu09
 * @version 1.0
 */
public class POOP6 {

    /**
     * Método principal que ejecuta el programa.
     * Crea e imprime dos objetos de la clase {@link Coche}.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        // Creación de objetos Coche
        Coche coche = new Coche();
        Coche coche2 = new Coche("rojo", "ford", "MXN-435");

        // Imprime las representaciones de los objetos Coche
        System.out.println(coche);
        System.out.println(coche2);
    }
}


