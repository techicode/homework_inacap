package guia9;

import java.util.Scanner;

public class ejercicio_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el valor del producto: ");
        int valorProducto = scanner.nextInt();

        int ipcFebrero = (int) (valorProducto * 1.03);
        int ipcMarzo = (int) (valorProducto * 1.06);

        System.out.println("El valor del producto con el ipc de febrero es "+ipcFebrero);
        System.out.println("El valor del producto con el ipc de marzo es "+ipcMarzo);
        System.out.println("La diferencia de precio entre el mes de febrero y marzo es: "+(ipcMarzo-ipcFebrero));
    }
}
