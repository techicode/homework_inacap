package clase8guia14;

import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 1;

        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();
        System.out.print("Ingrese el valor de la potencia: ");
        int powValue = scanner.nextInt();

        for (int i = 0; i < powValue ; i++) {
            total = number*total;
        }
        System.out.println(" "+number+"^"+powValue+" = "+total);
        System.out.println("El numero "+number+" elevado a la potencia ^"+powValue+" da como resultado = "+total);
    }
}
