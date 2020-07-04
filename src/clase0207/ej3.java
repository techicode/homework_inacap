package clase0207;

public class ej3 {
        public static void main(String[] args) {
            int [][] array2d = {{4, 12, 6, 7, 14,},{9, 10, 11, 12, 13}};
            int totalPares = 0, totalImpares = 0;

            System.out.println("Array: ");
            for (int i = 0; i < array2d.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(array2d[i][j]+" ");
                }
                System.out.println();
            }

            for (int i = 0; i < array2d.length; i++) {
                for (int j = 0; j < 5; j++) {
                    if (array2d[i][j] % 2 == 0){
                        totalPares ++;
                    }else {
                        totalImpares ++;
                    }
                }
            }
            System.out.println("el numero total de pares es: "+totalPares);
            System.out.println("El numero total de impares es: "+totalImpares);
        }
}
