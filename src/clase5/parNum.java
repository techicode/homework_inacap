package clase5;

import java.util.Scanner;

public class parNum {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite un numero del 1 al 100: ");
            numero = scanner.nextInt();
            if (numero <= 100){
                for (int i = 1; i <= numero ; i++) {
                    if (i%2 == 0){
                        System.out.println(i+" Es par");
                    }
                }
                break;
            }
            else {
                System.out.println("Numero invalido. vuelva a ingresar un numero.");
            }
        }
    }
}
