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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num1, opcion, suma, resta, mul, di;
        String letra;
        boolean logico = false;
        System.out.println("num");
        num = leer.nextInt();
        System.out.println("num1");
        num1 = leer.nextInt();
        while (logico == false) {
            System.out.println("MENU\n1.Sumar");//"\n" barra invertida n sirve para ponerlos abajo
            
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma = num + num1;
                    System.out.println("La suma de los numeros es " + suma);
                    break;
                case 2:
                    resta = num - num1;
                    System.out.println("La resta de los numeros es " + resta);
                    break;
                case 3:
                    mul = num * num1;
                    System.out.println("La Multiplicacion de los numeros es " + mul);
                    break;
                case 4:
                    di = num / num1;
                    System.out.println("La divicion de los numeros es " + di);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letra = leer.next();
                    if ("s".equals(letra.toLowerCase())) {
                        logico = true;
                    }
                    break;
                default:
                    System.out.println("Ninguna opcion es valida");

            }
        }

    }

}
/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
