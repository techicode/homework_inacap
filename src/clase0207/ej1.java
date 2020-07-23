package clase0207;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un numero: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            total = array[i] + total;
        }

        System.out.println("El total es: "+(total/10));
    }
}
