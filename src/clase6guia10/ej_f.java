package clase6guia10;

public class ej_f {
    public static void main(String[] args) {
    int[] notas = new int[]{70, 54, 61, 41, 55, 67, 32, 66, 20, 44,
                            52, 51, 60, 70, 66, 54, 55, 57, 66, 62,
                            55, 52, 54, 66, 60, 69, 58, 59, 41, 44,
                            66, 61, 62, 13, 66, 51, 44, 45, 56, 63};
    int total = 0;
    int notaMenor = 70;

        for (int i = 0; i < notas.length ; i++) {
            total = total + notas[i];
            if (notas[i] < notaMenor){
                notaMenor = notas[i];
            }
        }

        System.out.println("El promedio del curso es: "+(total / 40));
        System.out.println("La nota mas baja es : "+notaMenor);
    }
}
