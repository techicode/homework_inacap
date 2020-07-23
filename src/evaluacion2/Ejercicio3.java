/*
Realizar un contador de billetes y monedas, el código debe permitir contar la cantidad de
billetes y monedas, de una cifra indicada por el usuario, no mayor a 100.000.- y no
negativa, soló números. (obligatoria validación de datos).
Reglas:
El contador tiene las siguientes nominaciones
 Billetes de 20.000, máximo 4
 Billetes de 10.000, máximo 6
 Billetes de 2.000, máximo 10.
 Billetes de 1.000, máximo 10.
 Monedas de 500, máximo 20.
 Monedas de 100, máximo 30.
No se permiten valores con unidades y decenas (monedas de 50,10,5).
 */
package evaluacion2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decenaMil, millar, centena;
        int dinero = 0;
        int veinteMilBillete = 0;
        int diezMilBillete = 0;
        int dosmilBillete = 0;
        int milBillete = 0;
        int quinientoMoneda = 0;
        int cienMoneda = 0;
        int totalVeinteMil = 0, totalDiezMil = 0, totalDosMil = 0, totalMil = 0, totalQuinientos = 0 , totalCien =0;
        boolean flag = true;
        boolean flagDinero = true;
        boolean flagOpcion = true;

        while (flagDinero) {
            System.out.print("Ingrese el monto del dinero a comprobar: ");
            if (scanner.hasNextInt()){
                dinero = scanner.nextInt();
                if (dinero > 0 && dinero <= 100000 && dinero % 100 == 0) {
                    flagDinero = false;
                    break;
                    }
                else if (dinero % 100 != 0){
                    System.out.println("No se permiten valores con unidades y decenas.");
                    System.out.println("Vuelva a intentarlo.\n");
                }
                else if (dinero > 100000) {
                System.out.println("Debe ingresar un valor no mayor a $100.000. Vuelva a intentarlo \n");
                }
                else {
                    System.out.println("Debe ingresar un monto mayor a 0. Vuelva a intentarlo");
                }
            } else {
                System.out.println("Debe ingresar un numero. Vuelva a intentarlo");
                scanner.nextLine();
            }
        }
        while (flagOpcion) {
            System.out.println("Si desea obtener mayor numero de monedas y menos billetes digite 1");
            System.out.println("Si desea obtener mayor numero de billetes y menos monedas digite 2");
            System.out.print("Digite una opcion: ");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                while (flag && dinero >= 0) {
                    while (cienMoneda < 30 && dinero > 0) {
                        dinero -= 100;
                        cienMoneda++;
                        if (dinero > 0 && dinero % 1000 == 0 && cienMoneda > 20) {
                            break;
                        }
                        else if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }
                    while (quinientoMoneda < 20 && dinero > 0) {
                        dinero -= 500;
                        quinientoMoneda++;
                        if (dinero > 0 && dinero % 1000 == 0 && quinientoMoneda > 19) {
                            break;
                        }
                        if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }

                    while (milBillete < 10 && dinero > 0) {
                        dinero -= 1000;
                        milBillete++;
                        if (dinero % 10000 == 0 & dinero > 0) {
                            break;
                        }
                        if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }
                    while (dosmilBillete < 10 && dinero > 0) {
                        dinero -= 2000;
                        dosmilBillete++;
                        if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }
                    while (diezMilBillete < 6 && dinero > 0) {
                        dinero -= 10000;
                        diezMilBillete++;
                        if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }
                    while (veinteMilBillete < 4 && dinero > 0) {
                        dinero -= 20000;
                        veinteMilBillete++;
                        if (dinero == 0) {
                            flag = false;
                            break;
                        }
                    }
                }
                System.out.println("\n\t\t...Metodo con mas monedas y menos billetes...");
                System.out.println("\t\t...Comprobacion de billetes y monedas utilizadas...");
                if (veinteMilBillete > 0) {
                    totalVeinteMil = veinteMilBillete * 20000;
                    System.out.println("Total de billetes $20.000 x " + veinteMilBillete + " = " + (totalVeinteMil));
                }
                if (diezMilBillete > 0) {
                    totalDiezMil = diezMilBillete * 10000;
                    System.out.println("Total de billetes $10.000 x " + diezMilBillete + " = " + (totalDiezMil));
                }
                if (dosmilBillete > 0) {
                    totalDosMil = dosmilBillete * 2000;
                    System.out.println("Total de billetes $2.000 x " + dosmilBillete + " = " + (totalDosMil));
                }
                if (milBillete > 0) {
                    totalMil = milBillete * 1000;
                    System.out.println("Total de billetes $1.000 x " + milBillete + " = " + (totalMil));
                }
                if (quinientoMoneda > 0) {
                    totalQuinientos = quinientoMoneda * 500;
                    System.out.println("Total de monedas $500 x " + quinientoMoneda + " = " + (totalQuinientos));
                }
                if (cienMoneda > 0) {
                    totalCien = cienMoneda * 100;
                    System.out.println("Total de monedas $100 x " + cienMoneda + " = " + (totalCien));
                }

                int supertotal = totalVeinteMil + totalDiezMil + totalDosMil + totalMil + totalQuinientos + totalCien;
                System.out.println("Dando como total $" + (supertotal));
            flagOpcion = false;
            }else if (opcion == 2) {
                decenaMil = dinero - (dinero % 10000);
                millar = (dinero % 10000) - (dinero % 1000);
                centena = dinero % 1000;

                while (decenaMil != 0) {
                    if (decenaMil >= 20000 && veinteMilBillete < 4) {
                        decenaMil -= 20000;
                        veinteMilBillete++;
                    } else {
                        decenaMil -= 10000;
                        diezMilBillete++;
                    }
                }
                while (millar != 0) {
                    if (millar >= 2000 && dosmilBillete < 10) {
                        millar -= 2000;
                        dosmilBillete++;
                    } else {
                        millar -= 1000;
                        milBillete++;
                    }
                }
                while (centena != 0) {
                    if (centena > 500 && quinientoMoneda < 20) {
                        centena -= 500;
                        quinientoMoneda++;
                    } else {
                        centena -= 100;
                        cienMoneda++;
                    }
                }
                System.out.println("\n\t\t....Metodo con mas billetes y menos monedas....");
                System.out.println("\t\t...Comprobacion de billetes y monedas utilizadas...");
                if (veinteMilBillete > 0) {
                    totalVeinteMil = veinteMilBillete * 20000;
                    System.out.println("Total de billetes $20.000 x " + veinteMilBillete + " = " + (totalVeinteMil));
                }
                if (diezMilBillete > 0) {
                    totalDiezMil = diezMilBillete * 10000;
                    System.out.println("Total de billetes $10.000 x " + diezMilBillete + " = " + (totalDiezMil));
                }
                if (dosmilBillete > 0) {
                    totalDosMil = dosmilBillete * 2000;
                    System.out.println("Total de billetes $2.000 x " + dosmilBillete + " = " + (totalDosMil));
                }
                if (milBillete > 0) {
                    totalMil = milBillete * 1000;
                    System.out.println("Total de billetes $1.000 x " + milBillete + " = " + (totalMil));
                }
                if (quinientoMoneda > 0) {
                    totalQuinientos = quinientoMoneda * 500;
                    System.out.println("Total de monedas $500 x " + quinientoMoneda + " = " + (totalQuinientos));
                }
                if (cienMoneda > 0) {
                    totalCien = cienMoneda * 100;
                    System.out.println("Total de monedas $100 x " + cienMoneda + " = " + (totalCien));
                }

                int supertotal = totalVeinteMil + totalDiezMil + totalDosMil + totalMil + totalQuinientos + totalCien;
                System.out.println("Dando como total $" + (supertotal));
                flagOpcion = false;
            }else {
                System.out.println("La opcion digitada no existe, vuelva a intentarlo.\n");
            }
        }
    }
}