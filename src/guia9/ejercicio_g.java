package guia9;

import java.util.Scanner;

public class ejercicio_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el precio total de la compra: ");
        int totalCompra = scanner.nextInt();

        if (totalCompra > 1000){
            totalCompra = (int) (totalCompra*0.8);
        }

        System.out.println("El precio total de la compra es: "+totalCompra);
    }
}
