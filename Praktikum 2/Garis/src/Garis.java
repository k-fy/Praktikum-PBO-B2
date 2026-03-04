/*  Nama File       : Garis.java
    Deskripsi       : berisi atribut dan method dalam class titik 
    Pembuat         : Puti Shasta Khafiyani - 24060124140132
    Tanggal         : 28/02/2026
*/
 
public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    public static int counterGaris = 0;

    Garis(Titik T1, Titik T2){
        this.titikAwal = T1;
        this.titikAkhir = T2;
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    double getPanjang() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

        return (y2 - y1) / (x2 - x1);
    }

    Titik getTitikTengah() {
        double xMid = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yMid = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;

        Titik tengah = new Titik();
        tengah.setAbsis(xMid);
        tengah.setOrdinat(yMid);

        return tengah;
    }

    boolean isSejajar(Garis g) {
        double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dy1 = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();

        double dx2 = g.titikAkhir.getAbsis() - g.titikAwal.getAbsis();
        double dy2 = g.titikAkhir.getOrdinat() - g.titikAwal.getOrdinat();

        return dx1 * dy2 == dy1 * dx2;
    }

    boolean isTegakLurus(Garis g) {
        double dx1 = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dy1 = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();

        double dx2 = g.titikAkhir.getAbsis() - g.titikAwal.getAbsis();
        double dy2 = g.titikAkhir.getOrdinat() - g.titikAwal.getOrdinat();

        return (dx1 * dx2 + dy1 * dy2) == 0;
    }

    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }
}
