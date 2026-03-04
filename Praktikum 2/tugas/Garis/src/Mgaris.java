/*  Nama File       : Garis.java
    Deskripsi       : berisi atribut dan method dalam class titik 
    Pembuat         : Puti Shasta Khafiyani - 24060124140132
    Tanggal         : 28/02/2026
*/
 

public class Mgaris {
    public static void main(String[] args) {

        Titik t1 = new Titik();
        t1.setAbsis(0);
        t1.setOrdinat(0);

        Titik t2 = new Titik();
        t2.setAbsis(4);
        t2.setOrdinat(4);

        Titik t3 = new Titik();
        t3.setAbsis(0);
        t3.setOrdinat(2);

        Titik t4 = new Titik();
        t4.setAbsis(4);
        t4.setOrdinat(6);

        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        System.out.println("=== Garis 1 ===");
        g1.printGaris();
        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());

        System.out.println("\n=== Garis 2 ===");
        g2.printGaris();
        System.out.println("Panjang: " + g2.getPanjang());
        System.out.println("Gradien: " + g2.getGradien());


        Titik tengah = g1.getTitikTengah();
        System.out.println("\nTitik Tengah Garis 1: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");

        System.out.println("\nApakah sejajar? " + g1.isSejajar(g2));
        System.out.println("Apakah tegak lurus? " + g1.isTegakLurus(g2));

        System.out.println("\nJumlah objek Garis: " + Garis.getCounterGaris());
    }
}
