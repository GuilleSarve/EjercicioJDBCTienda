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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, n1, r;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para realizar la comparaciòn");
        n = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n1 = leer.nextInt();
        if (n == n1) {
            System.out.println(" los numeros son iguales ");
        } else if (n < n1) {
            System.out.println(n1+" es mayor "+n);
        } else if (n > n1) {
            System.out.println(n+" es mayor que "+n1);
        }
    }
}
