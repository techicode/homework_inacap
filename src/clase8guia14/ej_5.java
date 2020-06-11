/*
Crear un algoritmo que permita leer n números y determinar cuál fue el mayor
ingresado y, cuál el menor.
 */
package clase8guia14;

import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        do {
            System.out.print("Ingrese un numero (digite 0 para detener el proceso) : ");
            userInput = scanner.nextInt();
            if (userInput > maxNumber) {
                maxNumber = userInput;
            }
            if (userInput < minNumber) {
                minNumber = userInput;
            }
        } while (userInput != 0);
        System.out.println("El numero mayor ingresado es: "+maxNumber);
        System.out.println("El numero menor ingresado es: "+minNumber);

    }
}
