/*
Construir un algoritmo que utilizando 2 arreglos ordenados de 5 casillas, las pueda
mezclar en un solo arreglo de 10 casillas, este arreglo debe quedar ordenado.
 */
package arrayGuia15;

import java.util.Random;

public class EjercicioF {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayPrimero = new int[5];
        int[] arraySegundo = new int[5];
        int[] array = new int[10];
        int numAuxiliar;

        for (int i = 0; i < 5; i++) {
            arrayPrimero[i] = random.nextInt(99);
            arraySegundo[i] = random.nextInt(99);
        }

        System.out.println("Primer array: ");
        for (int number : arrayPrimero){
            System.out.print(" "+number);
        }

        System.out.println("\nSegundo array: ");
        for (int number : arraySegundo){
            System.out.print(" "+number);
        }


        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (k <= 4) {
                array[i] = arrayPrimero[k];
            }
            if (k > 4){
                array[i] = arraySegundo[k-5];
            }
            k++;
        }

        System.out.println("\nTercer array (desordenado): ");
        for (int number : array){
            System.out.print(" "+number);
        }



        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length -1; j++) {
                if (array[j] > array[j+1]){
                    numAuxiliar = array[j];
                    array[j] = array[j+1];
                    array[j+1] = numAuxiliar;
                }
            }
        }
        System.out.println("\nTercer arrray ordenado: ");
        for (int numero : array){
            System.out.print(numero+" ");
        }
    }
}
