/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Carlos
 */
public class Guerrero extends Personaje {
    
    private int fuerza;
    
    public Guerrero(String nombre, int vida, int fuerza) {
        super(nombre, vida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if (fuerza >= 0){
            this.fuerza = fuerza;
        }else {
        System.out.println("Fuerza no puede ser menor a 0");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", fuerza" + fuerza;
    }
 
    public void mostrarGuerrero(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Vida: "+getVida());
        System.out.println("Fuerza: "+fuerza);
    }
}
    
