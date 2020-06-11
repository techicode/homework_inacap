package clase7guia13;

import java.util.ArrayList;
import java.util.Scanner;

public class ej_g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> kidWeight = new ArrayList<>();
        ArrayList<Integer> kidHeight = new ArrayList<>();
        ArrayList<Integer> kidAge = new ArrayList<>();
        int i = 0;
        int totalWeight = 0;
        int totalHeight = 0;
        int totalAge = 0;
        float promWeight, promHeight, promAge;
        do {
            System.out.print("Ingrese el peso del niño (" + (i + 1) + ") : ");
            kidWeight.add(scanner.nextInt());
            System.out.print("Ingrese la altura del niño (" + (i + 1) + ") en centimetros : ");
            kidHeight.add(scanner.nextInt());
            System.out.print("Ingrese la edad del niño (" + (i + 1) + ") : ");
            kidAge.add(scanner.nextInt());
            i++;
            System.out.println("¿Desea agregar otro niño? (si/no): ");
            String userInput = scanner.next();
            if (userInput.toLowerCase().equals("no")){
                break;
            }
        }while (true);

        for (int h : kidWeight) {
            if (h > 40) {
                totalWeight++;
            }
        }
        for (int j : kidHeight) {
            if (j > 130) {
                totalHeight++;
            }
        }
        for (int k : kidAge) {
            if (k > 11 && k < 16) {
                totalAge++;
            }
        }

        promWeight = ((float) totalWeight / (float) kidWeight.size()) * 100;
        promHeight = ((float)totalHeight / (float)kidHeight.size()) * 100;
        promAge = ((float) totalAge / (float)kidAge.size()) * 100;
        System.out.println("El porcentaje de niños que pesan mas de 40kg es "+(promWeight)+"%");
        System.out.println("El porcentaje de niños que miden mas de 170cms es "+(promHeight)+"%");
        System.out.println("El porcentaje de niños que tienen entre 11 y 16 años es "+(promAge)+"%");
    }
}
