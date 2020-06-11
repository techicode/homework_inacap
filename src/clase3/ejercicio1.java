package clase3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese un numero entero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        num2 = scanner.nextInt();

        if (num1==num2){
            System.out.println("Los numeros son iguales.");
        }
        else {
            if (num1 > num2){
                System.out.println("El numero "+num1+" es mayor.");
            }
            else{
                System.out.println("El numero "+num2+" es mayor.");
            }
        }

    }
}
