/*
Introducir un numero por teclado.
Que nos diga si es positivo o negativo.
(Obligatorio ciclo SI)
 */

package evaluacion2;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float numero; // se ocupa float para abarcar numeros enteros y numeros decimales


        while (true){ // se ocupa un bucle infinito para que vuelva a preguntar en caso de que no ingrese un numero
            System.out.print("Ingrese un numero: ");
            if (scanner.hasNextFloat()){ // si el dato de scanner (input) es un entero, entramos a comprobar
                numero = scanner.nextFloat(); // como el dato de scanner es un numero, lo asignamos a la variable numero
                if (numero == 0){ // si numero es 0, arrojamos el siguiente mensaje
                    System.out.println("El numero 0 es un numero neutro");
                    break; // terminamos el ciclo para que termine nuestra aplicacion
                } else if (numero > 0){  // si numero es mayor 0 significa que es mayor
                    System.out.println("El numero ingresado es positivo.");
                    break; // terminamos el ciclo para que termine nuestra aplicacion
                } else { // en caso contrario que no sea 0 ni mayor a 0, nuestro numero es negativo
                    System.out.println("El numero ingresado es negativo");
                    break; // terminamos el ciclo para que termine nuestra aplicacion
                }
            } else { // si el dato de scanner no es un numero, arrojamos el mensaje de error y volvemos a pedir un numero
                System.out.println("Error, debe ingresar un numero.\n");
                scanner.nextLine();
            }
        }
    }
}
