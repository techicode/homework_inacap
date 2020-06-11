package clase4;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A:  ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = scanner.nextInt();

        if (b % a == 0){
            System.out.println("El numero A ("+a+") es divisor de B ("+b+")");
        }
        if (a % b == 0){
            System.out.println("El numero A ("+a+") es multiplo de B ("+b+")");
        }
        if (b / 2 == a){
            System.out.println("A ("+a+")  es la mitad de  b ("+b+")");
        }
        if (a > b ){
            System.out.println("El numero A ("+a+") es mayor que B ("+b+")");
        }
        if (a == b){
            System.out.println("El numero A ("+a+") es igual que B ("+b+")");
        }
        if (a < b){
            System.out.println("El numero A ("+a+") es menor que B ("+b+")");
        }
    }
}
