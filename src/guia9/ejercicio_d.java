package guia9;

import java.util.Scanner;

public class ejercicio_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Los numeros son iguales.");
        }
        if (numero1 > numero2){
            System.out.println("El numero "+numero1+" es mayor");
        }
        if (numero1 < numero2){
            System.out.println("El numero "+numero2+" es mayor");
        }
    }
}
