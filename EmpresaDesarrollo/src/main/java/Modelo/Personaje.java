/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Carlos
 */
public class Personaje {
    private String nombre;
    private int vida;
    
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getVida(){
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        if (vida >= 0) {
        this.vida = vida;
        }else {
            System.out.println("Vida no puede ser menor a 0");
        }
    }
    
    public void mostrarPersonaje() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Vida: "+vida);
    }
    
}

  
