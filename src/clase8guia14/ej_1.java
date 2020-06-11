package clase8guia14;

import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero hasta donde desea comprobar: ");
        int topNumber = scanner.nextInt();

        for (int i = 1; i < topNumber ; i++) {
            if ( i % 2 == 0){
                System.out.println("El numero ("+i+") es divible por 2.");
            }
            if (i % 3 == 0){
                System.out.println("El numero ("+i+") es divible por 3.");
            }
            if (i % 6 == 0){
                System.out.println("El numero ("+i+") es divible por 6.");
            }
        }
    }
}
