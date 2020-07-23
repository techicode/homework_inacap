package clase9;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ejCajero {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int saldoCajero = 100000;
        int password = 3311;
        int opcion, deposito, retiro, opcionRetiro, nuevaPassword;
        boolean operando = true;
        boolean opRetiro = true;
        boolean opPass = true;

        while (operando){
            System.out.print("\t\tBienvenido al cajero.");
            System.out.print("\nOpciones de operación.\n");
            System.out.println("(1) para mostrar el saldo disponible.");
            System.out.println("(2) para depositar dinero.");
            System.out.println("(3) para retirar dinero.");
            System.out.println("(4) para cambiar su contraseña.");
            System.out.println("(0) para salir.");
            System.out.print("\nIngrese la opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo disponibles es: ");
                    System.out.println("\t\t$ "+saldoCajero+".\n");
                    TimeUnit.SECONDS.sleep(3);
                    break;

                case 2:
                    while (true) {
                        System.out.print("Ingrese el valor que quiere depositar: ");
                        deposito = scanner.nextInt();
                        if (deposito > 0){
                            saldoCajero+= deposito;
                            System.out.println("\nEL nuevo saldo de la cuenta es $"+saldoCajero+".\n");
                            TimeUnit.SECONDS.sleep(3);
                            break;
                        } else {
                            System.out.println("El valor ingresado debe ser mayor a 0, vuelva a intentarlo.");
                            TimeUnit.SECONDS.sleep(3);
                        }
                    }
                    break;

                case 3:
                    while (opRetiro){
                        System.out.println("\n\nOpciones de retiro.");
                        System.out.println("(1) para retirar $5000.");
                        System.out.println("(2) para retirar $10000.");
                        System.out.println("(3) para retirar $20000.");
                        System.out.println("(4) para retirar $50000.");
                        System.out.println("(5) para retirar $100000.");
                        System.out.println("(6) para ingresar manualmente el valor.");
                        System.out.println("(0) para salir.");
                        System.out.print("Digite la opcion: ");
                        opcionRetiro = scanner.nextInt();
                        switch (opcionRetiro){
                            case 1:
                                if ((saldoCajero-5000) >= 10000) {
                                    saldoCajero -=5000;
                                    System.out.println("Se ha retirado $5000");
                                    System.out.println("Su nuevo saldo es $" + saldoCajero);
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("No se puede hacer el retiro.");
                                    System.out.println("Debe quedar con al menos $10000 en la cuenta.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Seleccione otro monto.");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                                break;

                            case 2:
                                if ((saldoCajero-10000) >= 10000) {
                                    saldoCajero -=10000;
                                    System.out.println("Se ha retirado $10000");
                                    System.out.println("Su nuevo saldo es $" + saldoCajero);
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("No se puede hacer el retiro.");
                                    System.out.println("Debe quedar con al menos $10000 en la cuenta.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Seleccione otro monto.");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                                break;

                            case 3:
                                if ((saldoCajero-20000) >= 10000) {
                                    saldoCajero -=20000;
                                    System.out.println("Se ha retirado $20000");
                                    System.out.println("Su nuevo saldo es $" + saldoCajero);
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("No se puede hacer el retiro.");
                                    System.out.println("Debe quedar con al menos $10000 en la cuenta.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Seleccione otro monto.");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                                break;

                            case 4:
                                if ((saldoCajero-50000) >= 10000) {
                                    saldoCajero -=50000;
                                    System.out.println("Se ha retirado $50000");
                                    System.out.println("Su nuevo saldo es $" + saldoCajero);
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("No se puede hacer el retiro.");
                                    System.out.println("Debe quedar con al menos $10000 en la cuenta.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Seleccione otro monto.");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                                break;

                            case 5:
                                if ((saldoCajero-100000) >= 10000) {
                                    saldoCajero -=100000;
                                    System.out.println("Se ha retirado $100000");
                                    System.out.println("Su nuevo saldo es $" + saldoCajero);
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("No se puede hacer el retiro.");
                                    System.out.println("Debe quedar con al menos $10000 en la cuenta.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Seleccione otro monto.");
                                    TimeUnit.SECONDS.sleep(3);
                                }
                                break;

                            case 6:
                                System.out.print("Ingrese el valor que quiere retirar: ");
                                retiro = scanner.nextInt();
                                if (retiro > 0 && (saldoCajero-retiro) >= 10000){
                                    saldoCajero-= retiro;
                                    System.out.println("El nuevo saldo de la cuenta es $"+saldoCajero+".\n\n");
                                    TimeUnit.SECONDS.sleep(3);
                                    break;
                                } else if ((saldoCajero-retiro) < 10000){
                                    System.out.println("No se puede realizar el retiro.");
                                    System.out.println("Su cuenta debe quedar con un minimo de saldo de $10000.");
                                    System.out.println("Su saldo es $"+saldoCajero);
                                    System.out.println("Vuelva a intentarlo.");
                                    TimeUnit.SECONDS.sleep(3);
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0, vuelva a intentarlo.");
                                }
                                break;

                            case 0:
                                opRetiro = false;
                                System.out.println("Volviendo al menu principal...\n");
                                break;

                            default:
                                System.out.println("La opcion ingresada no existe, vuelva a intentarlo");
                                TimeUnit.SECONDS.sleep(2);
                        }
                    }
                    break;

                case 4:
                    while (opPass) {
                        System.out.print("Ingrese la contraseña antigua: ");
                        if (scanner.nextInt() == password) {
                            System.out.print("Ingrese la nueva contraseña (4 digitos) : ");
                            nuevaPassword = scanner.nextInt();
                            if (nuevaPassword > 0 && nuevaPassword < 10000) {
                                password = nuevaPassword;
                                System.out.println("Se ha cambiado la contraseña correctamente. \n");
                                TimeUnit.SECONDS.sleep(2);
                                break;
                            } else {
                                System.out.println("La contraseña ingresada no es de 4 digitos");
                                TimeUnit.SECONDS.sleep(2);
                            }
                        } else {
                            System.out.println("La contraseña ingresada es incorrecta.");
                            System.out.println("Vuelva a intentarlo.");
                            TimeUnit.SECONDS.sleep(2);
                        }
                    }
                    break;

                case 0:
                    System.out.println("saliendo...");
                    operando = false;
                    break;

                default:
                    System.out.println("La opcion ingresada no existe, vuelva a intentarlo.");
                    TimeUnit.SECONDS.sleep(2);
            }
        }
    }
}
