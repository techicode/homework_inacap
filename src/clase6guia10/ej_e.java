package clase6guia10;

import java.util.Scanner;

public class ej_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        System.out.println("Ingrese 10 numeros.");
        for (int i = 0; i < 15 ; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los numeros convertidos a positivos son los siguientes: ");
        for (int i = 0; i < 15 ; i++) {
            System.out.println(numeros[i] * -1);

        }
    }
}
