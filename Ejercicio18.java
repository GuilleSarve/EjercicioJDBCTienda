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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, j = 0;
        System.out.println("Escriba 4 numeros que esten entre el 1 y el 20: ");
        do {
            do {
                num = leer.nextInt();
                if ((num < 1 || num > 20)) {
                    System.out.println("INCORRECTO, ingrese de nuevo");
                }
            } while (num < 1 || num > 20);

            System.out.print(num + " ");

            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }

            System.out.println(" ");

            j += 1;
        } while (j < 4);
    }

}
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
