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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, total = 0;
        Scanner leer = new Scanner(System.in);
            for (int i = 0; i < 20; i++) {
                num = leer.nextInt();
                total = total + num;
                System.out.println(" " + i);
                if ( num == 0 ) {
                    System.out.println("La suma total de los numeros ingresados es " + total);
                break;
            }
    }
    }
}
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
