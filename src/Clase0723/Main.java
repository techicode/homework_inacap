package Clase0723;

public class Main {
    private float CalcularPromedio (int array[]){ // funcion que acepta como parametro un array
        int suma = 0;
        for (int i = 0; i < array.length; i++) { // recorremos el array y sumamos cada uno de sus valores
            suma += array[i];
        }
        return (float) suma / array.length; // la suma total la dividimos por el largo del array, retornando promedio
    }

    public static void main(String[] args) {
        int[] array = {5,10,21,12,5}; // array de 5
        Main calcular = new Main();

        // llamamos a la funcion con el siguiente mensaje
        System.out.println("EL promedio del array es: "+calcular.CalcularPromedio(array));

    }
}
