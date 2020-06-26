
/*
Hacer un seudocódigo que imprima los números del 1 al 100. Que calcule la suma de
todos los números pares, por un lado, y por otro, la de todos los impares. (Obligatorio ciclo
mientras)
 */
package evaluacion2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 1;
        int totalPar = 0;
        int totalImpar = 0;

        while (numero <= 100){ //por lo general se ocupa un for, pero aqui se puede comprobar que un while tambien sirve
            if (numero % 10 == 0) { // los numeros 10 20 30 etc, pasan a una condicion especial
                System.out.print(" "+numero+" \n"); // si se cumple, al final del numero daran un salto de linea
            } else {
                System.out.print(" "+numero+" "); // aqui los numeros se imprimen de manera normal
            }
            if (numero % 2 == 0){
                totalPar += numero;
            } else {
                totalImpar += numero;
            }
            numero++;
        }
        System.out.println("\nLa suma de todos los numeros pares es: "+totalPar);
        System.out.println("La suma de todos los numeros impares es: "+totalImpar);
    }
}
