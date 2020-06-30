/*
Construir un algoritmo que recorra el vector del ejercicio anterior contando la
cantidad de negativos que hay en to do el arreglo
 */
package arrayGuia15;

public class EjercicioB {
    public static void main(String[] args) {
        int[][] array = {{5,-3,-1}, {15, 34, 11}, {1,-3, 6}};
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < 0){
                    contador++;
                }
            }
        }

        System.out.println("En total se contabilizaron "+contador+" numeros negativos.");
    }
}
