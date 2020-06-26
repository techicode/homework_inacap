package arrayGuia5;

import java.util.Random;

public class burbuja {
    public static void main(String[] args) {

        Random random = new Random(); // metodo para crear variables random

        int[] arrayNumeros = new int[10];
        int numAuxiliar;
        for (int i = 0; i < 10 ; i++) {
            arrayNumeros[i] = random.nextInt(99); // dentro de random indicamos el numero maximo a crear
        }

        System.out.println("\t\tLista de numeros desordenada \n\t\t(Generado de forma aleatoria)");
        for (int i : arrayNumeros){
            System.out.print(" "+i+" "); // mostramos la lista de numeros desordenada
        }

        //metodo burbuja
        for (int i = 0; i < arrayNumeros.length - 1; i++) {
            for (int j = 0; j < arrayNumeros.length -1; j++) {
                if (arrayNumeros[j] > arrayNumeros[j+1]){
                    numAuxiliar = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j+1];
                    arrayNumeros[j+1] = numAuxiliar;
                }
            }
        }

        System.out.println("\n\n\t\tLista de numeros ordenados");
        for (int i : arrayNumeros){
            System.out.print(" "+i+" "); // mostramos la lista de numeros ordenado
        }
    }
}
