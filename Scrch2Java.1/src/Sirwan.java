import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sirwan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String eingabe;
        double ergebnis;
        double x1;
        double x2;


        System.out.println(" Mit für ein Zeichen willst du arbeiten");



            System.out.println("Geben sie den wert für p ein? ");
            eingabe = br.readLine();
            double p = Double.parseDouble(eingabe);


            System.out.println("Geben sie den wert für q ein?");
            eingabe = br.readLine();
            double q = Double.parseDouble(eingabe);

            x1 =-p/2+(Math.sqrt(2));
            x2 =+p/2+(Math.sqrt(2));
            System.out.println(x1);



        }
    }