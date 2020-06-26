package arrayGuia5;

import java.util.Random;

public class insercion {
    public static void main(String[] args) {
        Random random = new Random(); // metodo para crear variables random

        int[] arrayNumeros = new int[10];
        int numAuxiliar, posicionActual;
        for (int i = 0; i < 10 ; i++) {
            arrayNumeros[i] = random.nextInt(99); // dentro de random indicamos el numero maximo a crear
        }

        System.out.println("\t\tLista de numeros desordenada \n\t\t(Generado de forma aleatoria)");
        for (int i : arrayNumeros){
            System.out.print(" "+i+" "); // mostramos la lista de numeros desordenada
        }

        //meotodo inserccion
        for (int i = 0; i < arrayNumeros.length; i++) {
            posicionActual = i;
            numAuxiliar = arrayNumeros[i];

            while ((posicionActual > 0) && (arrayNumeros[posicionActual-1] > numAuxiliar)){
                arrayNumeros[posicionActual] = arrayNumeros[posicionActual-1];
                posicionActual--;
            }
            arrayNumeros[posicionActual] = numAuxiliar;
        }

        System.out.println("\n\n\t\tLista de numeros ordenados");
        for (int i : arrayNumeros) {
            System.out.print(" " + i + " "); // mostramos la lista de numeros ordenado
        }
    }
}
