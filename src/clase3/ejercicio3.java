package clase3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Digite un numero: ");
        n1 = scanner.nextInt();
        System.out.print("Digite otro numero: ");
        n2 = scanner.nextInt();
        System.out.print("Digite otro numero: ");
        n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n2 > n3){
                System.out.println(" "+n1+" "+n2+" "+" "+n3);
            }
            else {
                System.out.println(" "+n1+" "+n3+" "+" "+n2);
            }
        }
        else{
            if (n2 > n1 && n2 > n3){
                if (n1 > n3){
                    System.out.println(" "+n2+" "+n1+" "+" "+n3);
                }
                else {
                    System.out.println(" "+n2+" "+n3+" "+" "+n1);
                }
            }
            else {
                if (n1 > n2){
                    System.out.println(" "+n3+" "+n1+" "+" "+n2);
                }
                else {
                    System.out.println(" "+n3+" "+n2+" "+" "+n1);
                }
            }
        }
    }
}
