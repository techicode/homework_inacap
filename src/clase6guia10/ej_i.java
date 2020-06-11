package clase6guia10;

import java.util.Scanner;

public class ej_i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de alumnos: ");
        int cantAlumnos = scanner.nextInt();
        int[] alumnos = new int[cantAlumnos];
        int contadorHombres = 0;
        int contadorMujeres = 0;
        String entrada;

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el sexo del alumno "+(i+1)+" H para hombre. M para mujer");
            entrada = scanner.next();
            if (entrada.toUpperCase().equals("H")){
                contadorHombres++;
            }
            else if (entrada.toUpperCase().equals("M")){
                contadorMujeres++;
            }
            else {
                System.out.println("El dato ingresado es incorrecto, vuelva a ingresaar H para hombre, M para mujer");
                i--;
            }
        }
        System.out.println("Del total de alumnos ("+cantAlumnos+").");
        System.out.println("La cantidad de hombres es: "+contadorHombres);
        System.out.println("La cantidad de mujeres es: "+contadorMujeres);
    }
}
