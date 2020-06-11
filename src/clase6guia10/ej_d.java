package clase6guia10;

import java.util.Scanner;

public class ej_d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorNeutro = 0;

        System.out.println("Ingrese 20 numeros.");
        for (int i = 0; i < 20 ; i++) {
            System.out.print("Ingrese el numero "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20 ; i++) {
            if (numeros[i] > 0){
                contadorPositivo++;
            }
            if (numeros[i] < 0){
                contadorNegativo++;
            }
            if (numeros[i] == 0){
                contadorNeutro++;
            }
        }
        System.out.println("La cantidad de numeros ingresados positivos es: "+contadorPositivo);
        System.out.println("La cantidad de numeros negativos ingresados es: "+contadorNegativo);
        System.out.println("La cantidad de numeros neutros ingresados es "+contadorNeutro);
    }
}
