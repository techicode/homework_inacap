package clase7guia13;

import java.util.Scanner;

public class ej_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int input = scanner.nextInt();


        if (input > 0){
            System.out.println("El numero ingresado es mayor a 0.");
            if (input % 2 == 0){
                System.out.println("El numero es par. ");
            } else {
                System.out.println("El numero es impar. ");
            }
        } else {
            System.out.println("El numero ingresado es menor que 0. ");
        }
    }
}
