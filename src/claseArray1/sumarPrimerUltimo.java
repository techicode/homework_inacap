/*
Sumar el 1er valor del primer array con el ultimo valor del 2do array
guardarlo en el tercer array
 */

package claseArray1;

import java.util.Random;

public class sumarPrimerUltimo {
    public static void main(String[] args) {

        int[] primerArray = {5, 10, 15, 25, 31};
        int[] segundoArray = {45, 30, 25, 15, 9};
        int[] tercerArray = new int[5];

        int j = 4;
        for (int i = 0; i < primerArray.length ; i++) {
            tercerArray[i] = primerArray[i] + segundoArray[j];
            j--;
        }

        System.out.println("Primer array: ");
        for (int i : primerArray){
            System.out.print(i+" ");
        }

        System.out.println("\nSegundo array: ");
        for (int i : segundoArray){
            System.out.print(i+" ");
        }

        System.out.println("\nSuma de todos arrays: ");
        for (int i : tercerArray){
            System.out.print(i+" ");
        }
    }
}
