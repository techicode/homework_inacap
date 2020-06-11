package guia9;

import java.util.Scanner;

public class ejercicio_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el valor neto de la factura: ");
        int netoFactura = scanner.nextInt();
        int valorConIva = (int) (netoFactura*1.19);
        System.out.println("El precio del producto mas el iva es: "+(valorConIva));
    }
}
