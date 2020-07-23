/*
Construir un algoritmo que permita rellenar un vector de 20 casillas, llenarlo de
números y luego ordenarlo. 
 */
package arrayGuia15;

import java.util.Random;

public class EjercicioE {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] array = new int[20];
        int numAuxiliar;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        System.out.println("\t\t\n\nArray desordenada");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
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

        System.out.println("\t\t\n\nArray ordenada");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
