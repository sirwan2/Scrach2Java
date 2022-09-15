public class Wetter {
    public static void main (String[] args) {
        double april = 14.6;
        double mai = 8.4;
        double juni = 9.3;
        double mittelwert = april + mai + juni;
        double ergebnis = mittelwert / 3;

        System.out.println("Regen im April :"+april);
        System.out.println("Regen im mai"+mai);
        System.out.println("Regen im Juni"+juni);
        System.out.println("Mittelwert "+ergebnis);
    }

}
