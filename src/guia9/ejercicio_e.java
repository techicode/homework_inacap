package guia9;

import java.util.Scanner;

public class ejercicio_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        while (true) {
            System.out.print("Escriba el año de nacimiento: ");
            int nacimiento = scanner.nextInt();
            if (nacimiento >= 1900) {
                edad = 2020 - nacimiento;
                break;
            } else {
                System.out.println("Vuelva a ingresar un año de nacimiento valido.");
            }
        }
        System.out.println("La edad de la persona es: " + edad);
    }
}