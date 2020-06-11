package tarea;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escriba un numero para comprobar si es par o no (Escriba 0 para salir) : ");
            int numeroComprobar = scanner.nextInt();

            if (numeroComprobar == 0){
                System.out.println("Saliendo.");
                break;
            }

            if (numeroComprobar % 2 == 0) {
                System.out.println("El numero " + numeroComprobar + " es par");
            } else {
                System.out.println("El numero " + numeroComprobar + " es impar");
            }
        }
    }
}
