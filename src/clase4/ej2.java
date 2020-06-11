package clase4;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el titulo del primer post: ");
        String tituloPost1 = scanner.nextLine();
        System.out.print("Ingrese la cantidad de likes del primer post: ");
        int likesPost1 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de dislikes del primer post: ");
        int dislikePost1 = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese el titulo del segundo post: ");
        String tituloPost2 = scanner.nextLine();
        System.out.print("Ingrese la cantidad de likes del segundo post: ");
        int likesPost2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de dislikes del segundo post: ");
        int dislikePost2 = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        System.out.print("Ingrese el titulo del tercer post: ");
        String tituloPost3 = scanner.nextLine();
        System.out.print("Ingrese la cantidad de likes del tercer post: ");
        int likesPost3 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de dislikes del tercer post: ");
        int dislikePost3 = scanner.nextInt();

        if (likesPost1 > likesPost2 && likesPost1 > likesPost3){
            System.out.println("El mejor post es "+tituloPost1+" con ("+likesPost1+") numero de likes");
        }
        else if (likesPost2 > likesPost1 && likesPost2 > likesPost3){
            System.out.println("El mejor post es "+tituloPost2+" con ("+likesPost2+") numero de likes");
        }
        else {
            System.out.println("El mejor post es "+tituloPost3+" con ("+likesPost3+") numero de likes");
        }

        if (dislikePost1 > dislikePost2 && dislikePost1 > dislikePost3){
            System.out.println("El peor post es "+tituloPost1+" con ("+dislikePost1+") numero de dislikes");
        }
        else if (dislikePost2 > dislikePost1 && dislikePost2 > dislikePost3){
            System.out.println("El peor post es "+tituloPost2+" con ("+dislikePost2+") numero de dislikes");
        }
        else {
            System.out.println("El peor post es "+tituloPost3+" con ("+dislikePost3+") numero de dislikes");
        }
    }
}
