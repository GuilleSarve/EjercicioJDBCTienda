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
public class Ejercicio17bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dim;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la dimension del cuadrado");
        dim = leer.nextInt();
        for (int i = 1; i <= dim; i++) {

            for (int j = 1; j <= dim; j++) {

                if ((i == dim || i == 1) || (j == 1 || j == dim)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
