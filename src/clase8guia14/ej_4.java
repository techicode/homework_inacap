/*
Crear un algoritmo que permita obtener la conversión de una temperatura en grado
Celsius, a Kelvin y Fahrenheit y viceversa.
 */
package clase8guia14;

import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de temperatura (C = Celcius) (K = Kelvin) (F = Fahrenheit): ");
        String userInput = scanner.next();
        System.out.print("Ingrese el valor de la temperatura: ");
        float tempInput = scanner.nextInt();

        if (userInput.toLowerCase().equals("c")){
            System.out.println("La temperatura "+tempInput+" fue ingresada en celcius.");
            System.out.println("Su conversion a grados kelvin es "+(tempInput + 273.15));
            System.out.println("Su conversion a grados fahrenheit es "+(tempInput * 1.8 + 32));
        } if (userInput.toLowerCase().equals("k")){
            System.out.println("La temperatura "+tempInput+" fue ingresada en kelvin.");
            System.out.println("Su conversion a grados celcius es "+(tempInput - 273.15));
            System.out.println("Su conversion a grados fahrenheit es "+((tempInput - 273.15) * 1.8 + 32));
        } if (userInput.toLowerCase().equals("f")){
            System.out.println("La temperatura "+tempInput+" fue ingresada en fahrenheit.");
            System.out.println("Su conversion a grados celcius es "+((tempInput - 32) * 1.8));
            System.out.println("Su conversion a grados kelvin es "+((tempInput - 32) * 1.8 + 273.15));
        }
    }
}
