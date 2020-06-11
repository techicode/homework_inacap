package clase7guia13;

import java.util.Scanner;

public class ej_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue, jumpValue;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Ingrese el primer valor: ");
        firstValue = scanner.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        secondValue = scanner.nextInt();
        System.out.print("Ingrese el valor del salto: ");
        jumpValue = scanner.nextInt();

        if (firstValue > secondValue){
            max = firstValue;
            min = secondValue;
        } else {
            min = firstValue;
            max = secondValue;
        }

        for (int i = (min); i < max; i+=jumpValue) {
            System.out.println(i);
        }
    }
}
