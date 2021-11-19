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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String f, e;
        Scanner leer = new Scanner(System.in);
        f = leer.next();
        e = "eureka";
        if (f.equals(e)) {
            System.out.println("La contraseña es CORRECTA");
        }
        else
            System.out.println("La contraseña es INCORRECTA");
        }
}
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/
