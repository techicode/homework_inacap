/*
Ingresar un inicio y un final, y listar los valores que se encuentran entre ellos, si el
inicio es menor que el final el algoritmo debe ser capaz de mostrar los valores en
forma creciente, si ocurre lo contrario debe mostrar en decreciente.
 */
package clase8guia14;

import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero inicial: ");
        int initialNumber = scanner.nextInt();
        System.out.print("Ingrese un numero final: ");
        int finalNumber = scanner.nextInt();

        if (initialNumber < finalNumber){
            for (int i = initialNumber; i <= finalNumber ; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = initialNumber; i >= finalNumber ; i--) {
                System.out.println(i);
            }
        }
    }
}
