package clase3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        int i = 1;

        while (i <= 10){
            System.out.print("Ingrese un numero entero: ");
            n = scanner.nextInt();
            if (n % 3 == 0){
                count = count + 1;
            }
            i++;
        }
        System.out.println("Se encontraron "+count+" numeros divisibles por 3");
    }
}
