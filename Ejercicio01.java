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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int n1,n2,suma;
     
    Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese el primer numero que desee sumar :");
       n1 = leer.nextInt();
       
       System.out.println("Ahora ingrese el segundo numero");
       n2 = leer.nextInt();
       
       suma = n1 + n2;
       System.out.println("La suma total de ambos numeros es :  " + suma);

        
        
        
        
        
  }
    
    
}
