package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eingabe = br.readLine();
        return eingabe;
    }
    public static int readInteger() throws IOException{
        while (true){
            String text = readString();
            try {
                int zahl = Integer.parseInt(text);
                return zahl;
            }
            catch (NumberFormatException e){
                System.out.println("Ungültige Eingabe. Bitte erneut versuchen");
            }
        }
    }


}
