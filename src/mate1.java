import java.util.Scanner;

public class mate1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int n = 1; ; n++){
            int azul = 3 * n - 2;
            int gris = (4 * n - 2) * (2 * n + 2);
            int rojo = 4;

            if (gris == 1008){
                System.out.println(n);
                break;
            }
        }
    }
}
