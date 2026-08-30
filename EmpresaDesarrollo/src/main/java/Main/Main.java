/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.Personaje;
import Modelo.Mago;
import Modelo.Guerrero;
import Modelo.Caballero;
/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args){
        
        Personaje p1 = new Personaje("Carlos", 200);
        Mago m1 = new Mago("Matias", 150, 200);
        Guerrero g1 = new Guerrero("Cristobal", 350, 200);
        Caballero c1 = new Caballero("Martin", 300, 150, 200);
        
        p1.mostrarPersonaje();
        System.out.println("============");
        m1.mostrarMago();
        System.out.println("============");
        g1.mostrarGuerrero();
        System.out.println("============");
        c1.mostrarCaballero();
    }
}
