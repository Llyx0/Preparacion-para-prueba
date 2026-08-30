/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Carlos
 */
public class Mago extends Personaje {
    
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0){
            this.mana = mana;
        }else {
            System.out.println("Mana no puede ser menor a 0");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", mana" + mana;
    }
    
    public void mostrarMago(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Vida: "+getVida());
        System.out.println("Mana: "+mana);
    }
    
}
