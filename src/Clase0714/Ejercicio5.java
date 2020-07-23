package Clase0714;

public class Ejercicio5 {
    public int[][] ordenarArray(int[][] array){
        int aux;

        // metodo burbuja para ordenar columnas
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] > array[i + 1][j]) {
                        aux = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = aux;
                    }
                }
            }
        }
        // metodo burbuja para ordenar filas.
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        aux = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = aux;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Ejercicio5 orden = new Ejercicio5();

        int[][] array3d = {{5,2,1,16},{16,11,12,3}, {15,4,10,8}, {7, 9, 2, 21}};

        System.out.println("Matriz desordenada: ");
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d.length; j++) {
                System.out.print(array3d[i][j]+" ");
            }
            System.out.println();
        }

        array3d = orden.ordenarArray(array3d);

        System.out.println("matriz ordenada de forma ascendiente (filas y columnas): ");
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d.length; j++) {
                System.out.print(+array3d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
