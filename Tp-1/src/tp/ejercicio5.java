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
public class ejercicio5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextInt();
        
        System.out.print("Operaciones\n" + "Suma: " + (numero1 + numero2) + "\nResta: " + (numero1 - numero2) + "\nMultiplicacion: " + (numero1 * numero2)+ "\nDivision: " + (numero1 / numero2));
    }
}
