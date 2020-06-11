package guia9;

import java.util.Scanner;

public class ejercicio_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
