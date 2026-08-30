/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Carlos
 */
public class Caballero extends Guerrero {
    
    private int armadura;
    
    public Caballero(String nombre, int vida, int fuerza, int armadura) {
        super (nombre, vida, fuerza);
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        if (armadura >= 0) {
            this.armadura = armadura;
        }else {
            System.out.println("Armadura no puede ser menor a 0");
        }
    }
    
    @Override
    public String toString() {
            return super.toString() + ", armadura" + armadura;
}
    
    public void mostrarCaballero() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Vida: "+getVida());
        System.out.println("Fuerza: "+getFuerza());
        System.out.println("Armadura: "+armadura);
    }
}
    

