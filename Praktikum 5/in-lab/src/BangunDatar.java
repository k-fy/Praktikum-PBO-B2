/* Nama File    : BangunDatar.java
 * Deskripsi    : Abstract class yang merepresentasikan bangun datar
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public abstract class BangunDatar {
    // Atribut untuk jumlah sisi, warna, dan border
    protected int jmlSisi;
    protected String warna;
    protected String border;

    // Atribut untuk menghitung jumlah objek BangunDatar yang dibuat
    private static int counterBangunDatar = 0;

    // Konstruktor default
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter untuk jumlah sisi, warna, dan border
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna   = warna;
        this.border  = border;
        counterBangunDatar++;
    }

    // Getter untuk jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Setter untuk jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Getter untuk warna
    public String getWarna() {
        return warna;
    }

    // Setter untuk warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Getter untuk border
    public String getBorder() {
        return border;
    }

    // Setter untuk border
    public void setBorder(String border) {
        this.border = border;
    }

    // Abstract method — wajib diimplementasi oleh subclass
    public abstract double getLuas();
    public abstract double getKeliling();

    // Metode untuk mengecek apakah luas bangun datar ini sama dengan bangun datar lain
    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }

    // Metode untuk mengecek apakah keliling bangun datar ini sama dengan bangun datar lain
    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }

    // Metode untuk menampilkan informasi tentang bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    // Metode untuk menampilkan jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Total Objek Bangun Datar: " + counterBangunDatar);
    }
}