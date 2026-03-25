/* Nama File    : Persegi.java
 * Deskripsi    : File atribut dan method dalam class Persegi,
 *                mewarisi BangunDatar dan mengimplementasi IResize
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class Persegi extends BangunDatar implements IResize {
    // Atribut untuk panjang sisi persegi
    private double sisi;
    public static int CounterPersegi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4);
        CounterPersegi++;
    }

    // Konstruktor dengan parameter untuk panjang sisi saja
    public Persegi(double sisi) {
        setJmlSisi(4);
        this.sisi = sisi;
        CounterPersegi++;
    }

    // Konstruktor dengan parameter untuk panjang sisi, warna, dan border
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
        CounterPersegi++;
    }

    // Getter untuk panjang sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk panjang sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung dan mengembalikan luas persegi
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung dan mengembalikan keliling persegi
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menghitung dan mengembalikan panjang diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Implementasi method zoomIn dari interface IResize 
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    // Implementasi method zoomOut dari interface IResize
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    // Implementasi method zoom dari interface IResize
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

    // Override metode printInfo untuk menampilkan informasi persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    // Method static untuk mencetak jumlah objek Persegi yang telah dibuat
    public static void printCounterPersegi() {
        System.out.println("Jumlah Objek Persegi: " + CounterPersegi);
    }
}