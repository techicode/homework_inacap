package clase6guia10;

import java.util.Scanner;

public class ej_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[7];
        int totalNota = 0;

        for (int i = 0; i < 7 ; i++) {
            System.out.print("Ingrese la nota ("+(i+1)+"): ");
            notas[i] = scanner.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            totalNota = totalNota + notas[i];
        }

        System.out.println("El promedio es: "+(totalNota/7));
    }
}
