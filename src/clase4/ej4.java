package clase4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del dinero a invertir: ");
        int dineroBase = scanner.nextInt();
//        int ganancias = (int) ((dineroBase * 0.02) * 12);
//
//        System.out.println("La ganacia que tendra en un año es "+ganancias);

        for (int i = 0; i < 12 ; i++) {
            dineroBase = (int) (dineroBase * 1.02);
        }
        System.out.println("El dinero que tendra despues de 1 año (reinvirtiendo cada mes) es: "+dineroBase);
    }
}
