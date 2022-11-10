public class MatheKLasse {
    public static void main(String [] args){
        int radius= 10;
        double flaeche = Math.pow(radius, 2) * Math.PI;
        double umsatzStuer = 34506.74;
        System.out.println(flaeche);
        System.out.println(Math.floor(umsatzStuer));
        System.out.println(Math.floor(umsatzStuer * 10) / 10);
        System.out.println(Math.min(300, flaeche));
        System.out.println(Math.max(300, flaeche));
        System.out.println(umsatzStuer * -1);
        System.out.println(Math.abs(umsatzStuer * -1));
        System.out.println(Math.sqrt(2));

    }
}
