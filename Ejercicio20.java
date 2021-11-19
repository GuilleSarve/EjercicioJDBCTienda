/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

/**
 *
 * @author Guille
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector = new int[101];
        vector = rellenar(vector);
        mostrar(vector);
    }

    public static int[] rellenar(int vector[]) {//Esto es una funcion (tine que retornar un valor)(acordarse de usar el RETURN)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        return (vector);
    }

    public static void mostrar(int vector[]) {//este es un subproceso(no retorna valores)
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }

    }

}
