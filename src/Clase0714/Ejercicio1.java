package Clase0714;

public class Ejercicio1 {

    // metodo que limpia el vector de enteros, de cualquier tamano
    public int[] limpiarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
    // metodo que limpia vector de caracteres, de cualqueir tamano
    public char[] limpiarArray(char[] array){
        for (int i =0; i < array.length; i++){
            array[i] = ' ';
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arrayFull = {2, 5, 6, 7, 8, 12, 14};
        char[] arrayChar = {'a', 'b', 'z', 'x','y'};

        Ejercicio1 array = new Ejercicio1();

        System.out.println("Array lleno (numeros): ");
        for (int i : arrayFull){
            System.out.print(" "+i);
        }

        System.out.println("\nArray vacio (numeros): ");
        for (int i : array.limpiarArray(arrayFull)){
            System.out.print(" "+i);
        }

        System.out.println("\nArray lleno (caracteres): ");
        for (char i : arrayChar){
            System.out.print(" "+i);
        }

        System.out.println("\nArray vacio (caracteres): ");
        for (char i : array.limpiarArray(arrayChar)){
            System.out.print(" "+i);
        }
    }
}
