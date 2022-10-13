package Taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMitEingabe {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       System.out.println(" Mit für ein Zeichen willst du arbeiten");


       System.out.println("Erste zahl.");
       String eingabe = bufferedReader.readLine();
       double zahl = Double.parseDouble(eingabe);


       System.out.println("Zweite zahl");
       String eingabe2 =bufferedReader.readLine();
       double zahl2 = Double.parseDouble(eingabe2);

       double ergebnis;
       double differenz;
       double produkt ;
       double Quotient;

       ergebnis= (zahl+zahl2);
       differenz= (zahl-zahl2);
       produkt= (zahl*zahl2);
       Quotient=(zahl/zahl2);

       System.out.println("Ergebnis beträgt"+ ergebnis);
       System.out.println("differenz beträgt" + differenz);
       System.out.println("produkt beträgt"+ produkt);
       System.out.println("Quotien beträgt"+ Quotient);



    }
}
