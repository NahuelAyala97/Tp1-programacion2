/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre,apellido;
        
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();
        
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
    }
}
