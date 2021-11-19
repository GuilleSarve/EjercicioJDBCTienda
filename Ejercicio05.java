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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
System.out.println("Ingrese el numero que desea trabajar");
        int n,d,t,r;     
        n = leer.nextInt();
        d=n+n;
        t=n+n+n;
        r=(int) Math.sqrt(n);        
System.out.println("el doble de su numero es "+d+" el triple de su numero es "+t+" la raiz de su numero es "+r);     
    }
    
}
