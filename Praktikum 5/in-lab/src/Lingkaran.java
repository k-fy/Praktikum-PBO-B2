/* Nama File    : Lingkaran.java
 * Deskripsi    : File atribut dan method dalam class Lingkaran,
 *                mewarisi BangunDatar dan mengimplementasi IResize
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class Lingkaran extends BangunDatar implements IResize {
    // Atribut untuk jari-jari lingkaran
    private double jari;
    public static int CounterLingkaran;

    // Konstruktor default
    public Lingkaran() {
        setJmlSisi(1);
        CounterLingkaran++;
    }

    // Konstruktor dengan parameter untuk jari-jari saja
    public Lingkaran(double jari) {
        setJmlSisi(1);
        this.jari = jari;
        CounterLingkaran++;
    }

    // Konstruktor dengan parameter untuk diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter / 2;
        CounterLingkaran++;
    }

    // Getter untuk jari-jari
    public double getJari() {
        return jari;
    }

    // Setter untuk jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menghitung dan mengembalikan luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Menghitung dan mengembalikan keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Implementasi method zoomIn dari interface IResize — menambah jari-jari 10%
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    // Implementasi method zoomOut dari interface IResize — mengurangi jari-jari 10%
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    // Implementasi method zoom dari interface IResize — menskalakan jari-jari sesuai persen
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

    // Override metode printInfo untuk menampilkan informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari   : " + jari);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    // Method static untuk mencetak jumlah objek Lingkaran yang telah dibuat
    public static void printCounterLingkaran() {
        System.out.println("Jumlah Objek Lingkaran: " + CounterLingkaran);
    }
}