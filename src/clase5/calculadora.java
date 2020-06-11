package clase5;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable1, variable2;
        String opcion;
        System.out.print("Digite el primer numero: ");
        variable1 = scanner.nextInt();
        System.out.print("Digite el segundo numero: ");
        variable2 = scanner.nextInt();


        while (true){
            System.out.println("Escriba la opcion S = sumar, R = resta, M = multiplicacion, D = division.");
            opcion = scanner.next();
            switch (opcion.toUpperCase()){
                case "S":
                    System.out.println("La suma es: "+(variable1 + variable2));
                    break;
                case "R":
                    System.out.println("La resta es: "+(variable1 - variable2));
                    break;
                case "M":
                    System.out.println("La multiplicacion es: "+(variable1 * variable2));
                    break;
                case "D":
                    System.out.println("La division es: "+(variable1 / variable2));
                    break;
                default:
                    System.out.println("La opcion digitada no existe");
            }
        }
    }
}
