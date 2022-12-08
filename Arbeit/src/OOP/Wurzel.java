package OOP;

import java.io.IOException;

public class Wurzel {
    public static void main(String[] args) throws IOException {
        System.out.println("was ist die erste Zahl:");
        int startZahl = IO.readInteger();
        System.out.println("was ist die letzte Zahl?");
        int endeZahl = IO.readInteger();

        for (int i = startZahl; i <=endeZahl; i++){
            System.out.println(i +  "Wurzel:" + Math.sqrt(i));
        }

    }

}
