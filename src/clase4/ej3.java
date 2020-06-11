package clase4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de M: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            m = sum + i;
            sum = m;
            System.out.println("i = "+i+" ; sumatoria: "+m);
        }
    }
}
