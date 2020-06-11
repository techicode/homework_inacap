/*
Crear un algoritmo que permita ingresar n números y totalizar pares e impares,
arrojar el número ganador en total y en cantidad.
 */
package clase8guia14;

import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Ingrese un numero (ingrese 0 para detener el proceso y generar resultados): ");
            userInput = scanner.nextInt();
            if (userInput == 0){
                break;
            } if (userInput % 2 == 0){
                evenCount++;
            } if (userInput % 2 != 0){
                oddCount++;
            }
            }

        if (evenCount > oddCount){
            System.out.println("Los numeros ganadores fueron los numero par " +
                    "(se ingresaron "+evenCount+" numeros pares.");
        }else {
            System.out.println("Los numeros ganadores fueron los numero impares " +
                    "(se ingresaron "+oddCount+" numeros impares.");
        }
    }
}
