/*
Construir un algoritmo que cargue valores numéricos en un arreglo unidimensional
de 15 casillas.
 */
package arrayGuia15;

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayVacio = new int[15];

        for (int i = 0; i < arrayVacio.length ; i++) {
            System.out.print((i+1)+". Ingrese un valor: ");
            arrayVacio[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayVacio.length ; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(arrayVacio[i]+" ");
        }
    }
}
