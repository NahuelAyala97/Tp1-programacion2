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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor, resultadoEntero;
        double resultadoDouble;

        System.out.print("Ingrese un dividendo: ");
        dividendo = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese un divisor: ");
        divisor = Integer.parseInt(sc.nextLine());
        
        resultadoEntero = dividendo / divisor;
        resultadoDouble = (double) dividendo / divisor;

        System.out.print("Resultado entero: " + resultadoEntero + "\nResultado double: " + resultadoDouble);
    }
}
