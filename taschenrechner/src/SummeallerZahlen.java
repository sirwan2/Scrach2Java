import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummeallerZahlen {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Geben sie eine Zahl ein");

     String eingabe = br.readLine();
     int zaehler = Integer.parseInt(eingabe.trim());

     int summe=0;

     for(int i = 1; i <= zaehler; i++){
         summe = summe + i;
     }
     System.out.println("Die Summe ist:"+ summe);



    }
}
