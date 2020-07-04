package clase0207;

public class ej2 {
    public static void main(String[] args) {
        int [][] array2d = {{4, 5, 6, 7, 8,},{9, 10, 11, 12, 13}};
        int sumaTotal = 0;

        System.out.println("Array sin sumar: ");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array2d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nTotal de la array sumada: ");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += array2d[i][j];
            }
        }
        System.out.println(sumaTotal);
    }
}
