package clase3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[7];
        int i = 0;
        int average = 0;
        while (i < 7){
            System.out.print("Escriba la nota "+(i+1)+": ");
            grades[i] = scanner.nextInt();
            if (grades[i] >= 10 && grades[i] <= 70){
                System.out.println("\t\t"+grades[i]+" Nota ingresada.");
                i++;
            }
            else {
                System.out.println("Nota fuera de rango, vuelva a ingresarla.");
            }
        }
        for (int j = 0; j < 7 ; j++) {
            average = average + grades[j];
        }
        System.out.println("\n\nEl promedio es "+(average/7));
    }
}
