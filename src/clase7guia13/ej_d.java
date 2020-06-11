package clase7guia13;

import java.util.Scanner;

public class ej_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Ingrese el primer valor: ");
        firstValue = scanner.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        secondValue = scanner.nextInt();


        if (firstValue > secondValue){
            max = firstValue;
            min = secondValue;
        } else {
            min = firstValue;
            max = secondValue;
        }

        for (int i = (max-1); i > min; i--) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
