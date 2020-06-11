package clase8guia14;

import java.util.Scanner;

/**
 * Calcular por medio de un algoritmo si un valor es un número primo.
 */

public class ej_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int userInput = scanner.nextInt();
        boolean flag = false;

        if (userInput > 1){
            for (int i = 2; i < userInput ; i++) {
                if (userInput % i == 0) {
                    flag = true;
                    break;
                }
                }
            } else {
            System.out.println("El numero "+userInput+" no es primo.");
        }
        if (flag){
            System.out.println("El numero "+userInput+" no es primo.");
        } else {
            System.out.println("El numero "+userInput+" es primo.");
        }
    }
}