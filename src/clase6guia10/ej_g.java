package clase6guia10;

import java.util.Scanner;

public class ej_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.println("La tabla de multiplicacion (hasta el 10) del numero ingresado es: ");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero+" x "+i+ " = "+(i*numero));
        }
    }
}
