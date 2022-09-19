import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notenschema  {
    public static void main (String[] args) throws IOException {
        /* Eingabeaufforderung*/
        System.out.println("Bitte geben sie eine (ganzzahlige) Prozentzahl ein: ");

        /* (Integer-) Eingabe lesen*/
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in ));
        String text = br.readLine(); //* = Eingabe (String) */
        int ergebnis = Integer.parseInt(  text.trim()  ); //* aus String wird Integer */
        int note;

             //30 < 27 ... falsch
        if (ergebnis<27) { /*6: falls ergebnis zwischen 0...27*/
            note = 6;
            // 45 > 30 ... richtig
        } else if (45>ergebnis){ /*5: falls ergebnis zwischen 27 ... 45 */
            note = 5;
        } else if (59>ergebnis){ /*4*/
            note = 4;
        }
        else if (73>ergebnis){ /*3*/
            note = 3;
        }
        else if (85>ergebnis){ /*2*/
             note = 2;
        }
        else  { /*1*/
            note = 1;
        }

       System.out.println("Deine Note ist: " + note);
    }/*main*/
}
