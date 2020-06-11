package clase3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int familySize;
        int manCount = 0;
        int womanCount = 0;
        int input;
        int averageAge = 0;

        System.out.print("Ingrese el numero de integrantes de la familia: ");
        familySize = scanner.nextInt();

        int[] age = new int[familySize];
        for (int i = 0; i < familySize ; i++) {
            System.out.print("\nIngrese la edad de la persona ["+(i+1)+"]: ");
            age[i] = scanner.nextInt();
            System.out.print("Indique el sexo de la persona ["+(i+1)+"] (1 para hombre, 2 para mujer :");
            input = scanner.nextInt();
            if (input == 1){
                manCount++;
            }
            if (input == 2){
                womanCount++;
            }
        }

        for (int i = 0; i < familySize ; i++) {
            averageAge = averageAge + age[i];
        }

        System.out.println("La edad promedio de la familia es "+(averageAge/familySize));
        System.out.println("Porcentaje de mujeres %"+(womanCount*100/familySize));
        System.out.println("Porcentaje de hombres %"+(manCount*100/familySize));
    }
}
