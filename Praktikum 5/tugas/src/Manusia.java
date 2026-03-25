/* Nama File    : Manusia.java
 * Deskripsi    : Abstract class Manusia sebagai superclass PNS, Pengusaha, dan Petani
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Manusia {
    // Atribut untuk nama, tanggal mulai kerja, alamat, dan pendapatan
    protected String    nama;
    protected LocalDate tglMulaiKerja;
    protected String    alamat;
    protected double    pendapatan;

    // Atribut untuk menghitung jumlah objek Manusia yang dibuat
    private static int counterMns = 0;

    // Konstruktor dengan parameter tanpa alamat
    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan) {
        this.nama          = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan    = pendapatan;
        this.alamat        = "-";
        counterMns++;
    }

    // Konstruktor lengkap dengan alamat
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama          = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat        = alamat;
        this.pendapatan    = pendapatan;
        counterMns++;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk tanggal mulai kerja
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    // Setter untuk tanggal mulai kerja
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    // Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter untuk pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Setter untuk pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Getter untuk counter Manusia
    public static int getCounterMns() {
        return counterMns;
    }

    // Abstract method hitungMasaKerja
    public abstract int hitungMasaKerja();

    // Metode untuk mencetak semua informasi atribut Manusia
    public void cetakInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Tgl Mulai Kerja : " + tglMulaiKerja);
        System.out.println("Alamat          : " + alamat);
        System.out.printf ("Pendapatan      : Rp %.2f%n", pendapatan);
    }
}