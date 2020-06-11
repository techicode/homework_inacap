package guia9;

import java.util.Scanner;

public class ejercicio_f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba la nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.print("Escriba la nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.print("Escriba la nota 3: ");
        int nota3 = scanner.nextInt();

        int promedio = (nota1+nota2+nota3) / 3;

        if (promedio >= 40){
            System.out.println("El alumno aprobo la asignatura con un promedio "+promedio);
        }
        else {
            System.out.println("El alumno reprobo la asginatura con un promedio "+promedio);
        }
    }
}
