package guia9;

import java.util.Scanner;

public class ejercicio_h {
    public static void main(String[] args) {
        int sueldoTotal, horasExtras, sueldoExtra;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        if (horasTrabajadas > 40){
            sueldoTotal = 40 * 1600;
            horasExtras = horasTrabajadas - 40;
            sueldoExtra = horasExtras * 2000;
            sueldoTotal = sueldoTotal + sueldoExtra;
        }
        else {
            sueldoTotal = horasTrabajadas * 1600;
        }

        System.out.println("El sueldo total ganado es: "+sueldoTotal);
    }
}
