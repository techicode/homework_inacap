package arrayGuia5;

import java.util.Random;

public class seleccion {
    public static void main(String[] args) {
        Random random = new Random(); // metodo para crear variables random

        int[] arrayNumeros = new int[10];
        int numAuxiliar, minimo;
        for (int i = 0; i < 10 ; i++) {
            arrayNumeros[i] = random.nextInt(99); // dentro de random indicamos el numero maximo a crear
        }

        System.out.println("\t\tLista de numeros desordenada \n\t\t(Generado de forma aleatoria)");
        for (int i : arrayNumeros){
            System.out.print(" "+i+" "); // mostramos la lista de numeros desordenada
        }

        //meotod seleccion
        for (int i = 0; i < arrayNumeros.length; i++) {
            minimo = i;
            for (int j = i+1; j < arrayNumeros.length ; j++) {
                if (arrayNumeros[j] <arrayNumeros[minimo]){
                    minimo = j;
                }
            }
            numAuxiliar = arrayNumeros[i];
            arrayNumeros[i] = arrayNumeros[minimo];
            arrayNumeros[minimo] = numAuxiliar;
        }

        System.out.println("\n\n\t\tLista de numeros ordenados");
        for (int i : arrayNumeros) {
            System.out.print(" " + i + " "); // mostramos la lista de numeros ordenado
        }
    }
}
