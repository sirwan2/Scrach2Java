package OOP;

import java.io.IOException;

public class Testio {
    public static void main(String[] args) throws IOException {
        System.out.println("gib was ein:");
        String was = IO.readString();
        System.out.println(was);

        System.out.println("gib ganzzahl du Kerr");
        int zahl1 =IO.readInteger();
        System.out.println(zahl1);

        System.out.println("gib kommazahl");
        int zahl2 =IO.readInteger();
        System.out.println(zahl2);

        System.out.println("weiterlaufen mit programm?");

        while (IO.readboolen());
    }

}
