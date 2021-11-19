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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int limite,num,suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero maximo de la suma");
      limite = leer.nextInt();
      
 while (suma < limite ){
     System.out.println("ingrese el numero que desea sumar para llegar al maximo");
      num = leer.nextInt();
    suma = suma + num;
 }
    }
}
  
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 