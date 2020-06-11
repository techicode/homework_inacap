package clase8guia14;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero inicial: ");
        int initialNumber = scanner.nextInt();
        System.out.print("Ingrese un numero final: ");
        int finalNumber = scanner.nextInt();

        if (initialNumber < finalNumber){
            for (int i = initialNumber; i <= finalNumber ; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = initialNumber; i >= finalNumber ; i--) {
                System.out.println(i);
            }
        }
    }
}
