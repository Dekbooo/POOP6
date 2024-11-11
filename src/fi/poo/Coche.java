/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase {@code Coche} que representa un vehículo con atributos básicos como color, marca y placa.
 * Incluye métodos para interactuar con el coche, como acelerar, frenar y cargar objetos.
 * 
 * @author poo03alu09
 * @version 1.0
 */
public class Coche {
   private String color;
   private String marca;
   private String placa;
   
   /**
    * Constructor por defecto de la clase {@code Coche}.
    */
   public Coche() {
   }

   /**
    * Constructor que inicializa el coche con color, marca y placa específicos.
    * 
    * @param color El color del coche.
    * @param marca La marca del coche.
    * @param placa La placa del coche.
    */
   public Coche(String color, String marca, String placa) {
       this.color = color;
       this.marca = marca;
       this.placa = placa;
   }

   /**
    * Obtiene el color del coche.
    * 
    * @return El color del coche.
    */
   public String getColor() { return color; }

   /**
    * Establece el color del coche.
    * 
    * @param color El color a asignar al coche.
    */
   public void setColor(String color) { this.color = color; }

   /**
    * Obtiene la marca del coche.
    * 
    * @return La marca del coche.
    */
   public String getMarca() { return marca; }

   /**
    * Establece la marca del coche.
    * 
    * @param marca La marca a asignar al coche.
    */
   public void setMarca(String marca) { this.marca = marca; }

   /**
    * Obtiene la placa del coche.
    * 
    * @return La placa del coche.
    */
   public String getPlaca() { return placa; }

   /**
    * Establece la placa del coche.
    * 
    * @param placa La placa a asignar al coche.
    */
   public void setPlaca(String placa) { this.placa = placa; }

   /**
    * Método para simular que el coche acelera.
    */
   public void acelerar() {
       System.out.println("acelerar");
   }

   /**
    * Método para simular que el coche frena.
    */
   public void frenar() {
       System.out.println("frenar");
   }

   /**
    * Método que simula la carga de un objeto en el coche.
    * 
    * @param cosa La descripción de la carga.
    * @return La carga que ha sido añadida al coche.
    */
   public String carga(String cosa) {
       System.out.println("cargando " + cosa);
       return cosa;
   }
   
   /**
    * Devuelve una representación en cadena del objeto {@code Coche}, 
    * mostrando el color, la marca y la placa del coche.
    * 
    * @return Una cadena de texto que describe el coche.
    */
   @Override
   public String toString() {
       return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
   }
}

