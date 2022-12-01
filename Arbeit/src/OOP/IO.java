package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    /**
     * liest einen Wahrheitswert von der Konsole ein
     *
     * @return Der Wahrheitswert
     * @throws IOException
     */

    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        return eingabe;
    }

    public static int readInteger() throws IOException {
        while (true) {
            String text = readString();
            try {
                int zahl = Integer.parseInt(text);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte erneut versuchen");
            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            String text = readString();
            try {
                double zahl = Double.parseDouble(text);
                return zahl;
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte erneut versuchen");
            }
        }


    }


    public static boolean readboolen() throws IOException {
        while (true) {
            String eingabe = readString();
            boolean nein = eingabe.equalsIgnoreCase("nein");
            if (eingabe.equals("yes") || (eingabe.equalsIgnoreCase("ja"))) {
                return true;
            } else if ((eingabe.equals("no")) || (eingabe.equalsIgnoreCase("nein")))
                return false;
            return false;
        }

    }
}

