package clase6guia10;

import java.util.Scanner;

public class ej_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 numeros.");
        for (int i = 0; i < 10 ; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10 ; i++) {
            if (numeros[i] > 0){
                System.out.println(numeros[i]);
            }
        }
    }
}
