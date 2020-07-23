/*
 Construir un algoritmo que utilizando un arreglo de 10 casillas, permita cargar 10
valores numéricos y determinar el promedio de todos ellos.
 */
package arrayGuia15;

import java.util.Random;

public class EjercicioC {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] =  random.nextInt(99);
        }

        System.out.println("Numeros en el array.");
        for (int numeros : array){
            System.out.print(" "+numeros);
        }

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        System.out.println("\n\nEl promedio es: "+(total/array.length));
    }
}
