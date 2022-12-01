import OOP.IO;

import java.io.IOException;

public class Benzinverbrauch {

    public static void main(String[] args) throws IOException {

        System.out.println(" Wie viele kilometer sind sie gefahren");
        double kilometer = IO.readDouble();

        System.out .println("Wie viele Kraftstoffes haben Sie verbraucht?");
        double kraftstoffeinliter = IO.readDouble();

        double durchschnittsverbrauch = 100 * ( kraftstoffeinliter / kilometer);

        if (durchschnittsverbrauch < 0){
            System.out.println("Falsche Eingabe");

        } else if(durchschnittsverbrauch == 0) {
            System.out.println("Fehler");
        } else {
            System.out.println("Der Durchschnittververbraucht ist :' + durchschnittsverbrauch");
        }
    }

    }