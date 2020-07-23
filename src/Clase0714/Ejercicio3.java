package Clase0714;

public class Ejercicio3 {

    public void contarRepetido(int[] array){
        int [] contador = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]){
                        contador[i]++;
                }
            }
            System.out.println("El numero ("+array[i]+") esta repetido "+contador[i]+" veces.");
        }
    }

    public static void main(String[] args) {
        int[] arregloNum = {5, 6, 6, 5, 6, 2, 1, 0};

        Ejercicio3 checker = new Ejercicio3();

        checker.contarRepetido(arregloNum);
    }
}
