package OOP;

import java.io.IOException;

public class Testio {
    public static void main(String[] args) throws IOException {
        System.out.println("gib was ein:");
        String was = IO.readString();
        System.out.println(was);
    }

}
