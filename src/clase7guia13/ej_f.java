package clase7guia13;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ej_f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas a promediar: ");
        int scoreNumber = scanner.nextInt();
        int scores[] = new int[scoreNumber];
        int total = 0;

        for (int i = 0; i < scoreNumber ; i++) {
            System.out.print("Ingrese la nota ( "+(i+1)+" ) : ");
            scores[i] = scanner.nextInt();
        }
        for (int i = 0; i < scoreNumber ; i++) {
            total = total + scores[i];
        }

        System.out.println("El promedio es "+(total/scoreNumber)+" .");
    }
}
