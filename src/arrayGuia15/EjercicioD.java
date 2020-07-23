/*
Construir un algoritmo que permita ingresar 10 valores en un arreglo unidimensional
y permita, luego, encontrar entre todos cual es el valor más alto.
 */
package arrayGuia15;

import java.util.Random;

public class EjercicioD {
    public static void main(String[] args) {
        int max = 0;
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(99);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("Numeros en el array.");
        for (int numeros : array){
            System.out.print(" "+numeros);
        }

        System.out.println("\n\nEl numero mayor es: "+max);
    }
}
