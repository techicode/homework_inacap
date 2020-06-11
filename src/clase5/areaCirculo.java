package clase5;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        double piValor = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        double ratio = scanner.nextDouble();
        double area = piValor * Math.pow(ratio,2);

        System.out.println("El area del circulo es "+area);
    }
}
