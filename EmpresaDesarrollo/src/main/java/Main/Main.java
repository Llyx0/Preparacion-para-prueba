/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Modelo.Personaje;
import Modelo.Mago;
import Modelo.Guerrero;
import Modelo.Caballero;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe nombre Mago: ");
        String nombreMago = scanner.nextLine();
        
        System.out.println("Escribe vida Mago: ");
        int vidaMago = scanner.nextInt();
        
        System.out.println("Escribe mana Mago: ");
        int manaMago = scanner.nextInt();
        scanner.nextLine(); //
        
        Mago m1 = new Mago(nombreMago, vidaMago, manaMago);
        System.out.println("====== CREAR MAGO ======");
        m1.mostrarMago();
        
        System.out.println("Escribe nombre Caballero: ");
        String nombreCaballero = scanner.nextLine();
        
        System.out.println("Escribe vida Caballero: ");
        int vidaCaballero = scanner.nextInt(); 
        
        System.out.println("Escribe fuerza Caballero: ");
        int fuerzaCaballero = scanner.nextInt();
        
        System.out.println("Escribe armadura Caballero: ");
        int armaduraCaballero = scanner.nextInt();
        scanner.nextLine(); //
        
        Caballero c1 = new Caballero (nombreCaballero, vidaCaballero, fuerzaCaballero, armaduraCaballero);
        System.out.println("====== CREAR CABALLERO ======");
        c1.mostrarCaballero();
        
        System.out.println("====== PERSONAJES CREADOS ======");
        System.out.println("Mago:");
        m1.mostrarMago();
        System.out.println("======");
        System.out.println("Caballero:");
        c1.mostrarCaballero();
        
        scanner.close();
    }
}
