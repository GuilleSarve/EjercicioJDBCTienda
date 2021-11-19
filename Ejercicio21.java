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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, n1;
        System.out.println("Ingrese el tamaño del vector ");
        n = leer.nextInt();
        int[] vector = rellenar(n);
        System.out.println("Ingrese el numero que desea buscar ");
        n1 = leer.nextInt();
        mostrar(n1, vector);
    }

    public static int[] rellenar(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);

        }
        return (vector);
    }

    public static void mostrar(int n1, int vector[]) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (n1 == vector[i]) {

                System.out.println("su numero se encuentra en " + i + " y se repite " + contador);
                contador++;//es igual a contador +=1 que es lo mismo que contador = contador + 1
            } 
            }
if (contador==0){
    System.out.println("no se encontro");
}
        }

    }


//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido
