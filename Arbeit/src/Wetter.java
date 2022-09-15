public class Wetter {
    public static void main (String[] args) {
        double april = 14.6;
        double mai = 8.4;
        double juni = 9.3;
        double Mittelwert = april + mai + juni;
        double ergebnis = Mittelwert / 3;

        System.out.println("Regen im april :"+april);
        System.out.println("Regen im mai"+mai);
        System.out.println("Regen im juni"+juni);
        System.out.println("Mittelwert "+ergebnis);
    }

}
