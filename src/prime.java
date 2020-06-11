import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero para comprobar si es primo: ");
        int numeroPrimo = scanner.nextInt();
        int i = 2;
        boolean flag = false;

        if (numeroPrimo>1){
            while (i<numeroPrimo){
                if (numeroPrimo % i == 0) {
                    flag = true;
                    System.out.println("No es un numero primo");
                    break;
                }
                i = i+1;
            }
        }
        else {
            System.out.println("No es un numero primo");
        }

        if (flag == false){
            System.out.println("El numero es primo");
        }
    }
}
