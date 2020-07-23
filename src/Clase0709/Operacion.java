package Clase0709;

import java.util.Scanner;

public class Operacion {
    Scanner scanner = new Scanner(System.in);

    // proceso que no recibe parametros y no retorna
    public void Suma(){
        System.out.print("Ingrese el primer valor: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int b = scanner.nextInt();
        int resultado = a + b;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    // proceso que recibe 2 parametros y no retorna
    public void Division(int a, int b){
        System.out.println("El resultado de la division es: "+ a / b);
    }

    // proceso que recibe 2 parametros y returna
    public int Multiplicacion(int a, int b){
        int resultado = a * b;
        return resultado;
    }

    // proceso que recibe 2 parametros y returna
    public int Resta(int a, int b){
        int resultado = a - b;
        return resultado;
    }
}
