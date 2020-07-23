/*
Construir un algoritmo que cargue valores numéricos en un arreglo bidimensional
de 15 casillas.
 */
package arrayGuia15;

public class EjercicioA_2D {
    public static void main(String[] args) {

        int[][] array2D = new int[3][5];

        int h = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array2D[i][j] = h;
                h++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+array2D[i][j]);
            }
            System.out.println();
        }
    }
}
