package clase6guia10;

public class ej_h {
    public static void main(String[] args) {
        int minutos = 0;
        int segundos = 0;
        int horas = 0;

        for (int i = 0; i < 86400 ; i++) {
            segundos++;
            if (segundos == 60){
                minutos++;
                segundos = 0;
                if (minutos == 60){
                    horas++;
                    minutos = 0;
                }
            }
            if (segundos < 10){
                System.out.println(horas+":"+minutos+":0"+segundos);
            }
            else {
                System.out.println(horas+":"+minutos+":"+segundos);
            }

        }
    }
}
