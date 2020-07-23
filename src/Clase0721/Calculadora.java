package Clase0721;

import java.util.Scanner;

public class Calculadora {

    private int sumar(int a, int b){
        return a + b;
    }

    private int restar(int a, int b){
        return a - b;
    }

    private int dividir(int a, int b){
        if (b == 0){
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return a / b;
        }
    }

    private int multiplicar(int a, int b){
        return a * b;
    }

    private int[] resultados(int a, int b){
        int[] array = new int[4];
        array[0] = a + b;
        array[1] = a - b;
        array[2] = a * b;
        array[3] = a / b;
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculador = new Calculadora();

        int numero1, numero2;
        String op;
        boolean flag = true;
        int[] historial = new int[4];
        int j = 0;

        while (flag) {
            System.out.print("Digite el primer numero: ");
            numero1 = scanner.nextInt();

            System.out.print("Digite el segundo el numero: ");
            numero2 = scanner.nextInt();

            System.out.println("'S' para sumar. 'R' para restar. 'D' para dividir. 'M' para multiplicar. 'Q' para todos los resultados.");
            System.out.print("Ingrese la operacion: ");
            op = scanner.next();

            if (j >= 4){
                j = 0;
            }
            switch (op.toUpperCase()) {
                case "S":
                    System.out.println("El resultado es: " + calculador.sumar(numero1, numero2));
                    historial[j] = calculador.sumar(numero1, numero2);
                    j++;
                    break;
                case "R":
                    System.out.println("El resultado es: " + calculador.restar(numero1, numero2));
                    historial[j] = calculador.restar(numero1, numero2);
                    j++;
                    break;
                case "D":
                    System.out.println("El resultado es: " + calculador.dividir(numero1, numero2));
                    historial[j] = calculador.dividir(numero1, numero2);
                    j++;
                    break;
                case "M":
                    System.out.println("El resultado es: " + calculador.multiplicar(numero1, numero2));
                    historial[j] = calculador.multiplicar(numero1, numero2);
                    j++;
                    break;
                case "Q":
                    int[] array = calculador.resultados(numero1, numero2);
                    System.out.println("La suma es: "+array[0]);
                    System.out.println("La resta es: "+array[1]);
                    System.out.println("La multiplicacion es: "+array[2]);
                    System.out.println("La division es: "+array[3]);
                    break;
                default:
                    System.out.println("La opcion ingresada no existe.");
            }
            System.out.println("Escriba 'H' para mostrar el historial. Escriba 'N' para salir. Escriba cualquier letra para continuar.");
            op = scanner.next();
            if (op.toUpperCase().equals("N")){
                System.out.println("Cerrando la calculadora...");
                flag = false;
            } else if (op.toUpperCase().equals("H")){
                System.out.println("El historial es: ");
                for (int h : historial){
                    System.out.print("["+h+"] ");
                }
                System.out.println();
            }
        }
    }
}
