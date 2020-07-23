package Clase0714;

import java.util.Scanner;

public class Ejercicio4 {
    public int[] borrarElemento(int [] array, int pos){
        for (int i = pos; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio4 borrar = new Ejercicio4();

        int[] arregloNumeros = {5, 6, 7, 8 , 9, 10};

        System.out.print("Indique la posicion que desea eliminar (0 a 5): ");
        int pos = scanner.nextInt();

        System.out.println("Arreglo normal");
        for (int arregloNumero : arregloNumeros) {
            System.out.print(" " + arregloNumero);
        }

        arregloNumeros = borrar.borrarElemento(arregloNumeros,pos);

        System.out.println("\nArreglo con el valor borrado");
        for (int i = 0; i < arregloNumeros.length-1; i++) {
            System.out.print(" "+ arregloNumeros[i]);
        }
    }
}
