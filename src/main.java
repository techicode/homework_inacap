public class main {
    public static void main(String[] args) {
        int tanqueCapacidad = 200;
        int taza = 50;

        while (tanqueCapacidad > 0 ){ // mientras que el tanque tenga mas de 0 litros
            tanqueCapacidad -= taza; // le sacaremos una taza (de 50litros)
            System.out.println(tanqueCapacidad);
        }
    }
}
