package OOP;

import java.io.IOException;

public class Fakultaet {
    public static void main(String[] args) throws IOException {
        System.out.println(" welche Fakultaet soll ermittelt werden:");
        int ganzZahl = IO.readInteger();
        /* double fakultaet = i;
        int i = 1;
        while (i < ganzZahl ){
         fakultaet = fakultaet *1;

         }*/
        double fakultaet = 1;
        for (int i = 1; ganzZahl >= i; i ++) {
            fakultaet = fakultaet * i;

        }
        System.out.println("Die Fakultaet von " + ganzZahl + "beträgt " + fakultaet + "Du KER");
      }

   }

