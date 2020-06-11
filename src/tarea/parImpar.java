package tarea;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 % 2 == 0){
            System.out.println("El numero "+numero1+" es par.");
        }
        if (numero2 % 2 == 0){
            System.out.println("El numero "+numero2+" es par");
        }

        else{
            System.out.println("Ninguno de los numeros ingresados es par.");
        }
    }
}
