package clase0207;

public class ej4 {
    public static void main(String[] args) {
        String [] arrayHolaReves = {"o","o","n","m","u","a","l","h","*","d"};
        String [] arrayHolaNormal = new String[10];

        for (int i = 0; i < arrayHolaReves.length; i++) {
            if (arrayHolaReves[i].equals("h")){
                arrayHolaNormal[0] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("o")){
                arrayHolaNormal[1] = arrayHolaReves[i];
                arrayHolaNormal[9] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("l")){
                arrayHolaNormal[2] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("a")) {
                arrayHolaNormal[3] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("*")){
                arrayHolaNormal[4] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("m")){
                arrayHolaNormal[5] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("u")){
                arrayHolaNormal[6] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("n")){
                arrayHolaNormal[7] = arrayHolaReves[i];
            } else if (arrayHolaReves[i].equals("d")){
                arrayHolaNormal[8] = arrayHolaReves[i];
            }
        }

        for (String i : arrayHolaReves){
            System.out.print(i+" ");
        }
        System.out.println();
        for (String i : arrayHolaNormal){
            System.out.print(i+" ");
        }
    }
}
