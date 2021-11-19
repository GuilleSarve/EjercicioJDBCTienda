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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i=0;
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        if (n % 2 == 0) {
            System.out.println("Su numero es par");
        }else
            i +=1;
            System.out.println("Su numero es impar" + i);
    }
}
