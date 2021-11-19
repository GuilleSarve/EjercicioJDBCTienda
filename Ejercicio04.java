/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int F,C ;
        System.out.println("Ingrese la temperatura en grados centigrados");
        C = leer.nextInt();
F =32+(9*C/5);
        System.out.println("Esta es la temperatura en grados farenheit "+F);

    }
    
}
