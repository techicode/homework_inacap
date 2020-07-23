package Clase0709;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();

        // proceso que no entrega parametros ni tampoco retorna
        operacion.Suma();

        // proceso que entrega 2 parametros, pero no retorna
        operacion.Division(8,2);

        // proceso que entrega 2 parametros y si retorna
        System.out.println("El resultado es de la multiplicacion es: "+operacion.Multiplicacion(8,2));

        // proceso que entrega 2 parametros y si retorna
        System.out.println("El resultado de la resta es: "+operacion.Resta(8,2));
    }
}
