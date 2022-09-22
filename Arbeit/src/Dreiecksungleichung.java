import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreiecksungleichung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println ("Geben sie die seite A ein? ");
        String eingabe = br.readLine();
        double a = Double.parseDouble(eingabe);


        System.out.println ("Geben sie die seite B ein?");
        eingabe = br.readLine();
        double b = Double.parseDouble(eingabe);

        System.out.println ("Geben sie die seite C ein? ");
        eingabe = br.readLine();
        double c = Double.parseDouble (eingabe);

        double umfang ;
        double flaecheninhalt ;
        double halfteumang;


        if ((a+b>c) && (a+c>b) && (b+c>a)) {
            System.out.println("Ja ");
            umfang = a + b + c;
            System.out.println("Umfang" + umfang);
            // flächeninhalt nach dem Satz von Heron
            double s = (a + b + c) / 2;
            flaecheninhalt = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("flächeninhalt" + flaecheninhalt);

        }else{
            System.out.println("Es geht nicht noob");
        }
    }
}



