/* Nama File    : Pengusaha.java
 * Deskripsi    : Class Pengusaha yang mewarisi Manusia dan mengimplementasi interface Pajak
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    // B = digit ke-13 NIM : 24060124140132 -> digit ke-13 = 3
    private static final int B = 3;

    // Atribut NPWP dan counter Pengusaha
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstruktor tanpa alamat
    public Pengusaha(String nama, LocalDate tglMulaiKerja, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Konstruktor lengkap dengan alamat
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter untuk NPWP
    public String getNpwp() {
        return npwp;
    }

    // Setter untuk NPWP
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Getter untuk counter Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Implementasi hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return (int) tahun + B;
    }

    // Implementasi hitungPajak: 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Override cetakInfo untuk mencetak seluruh atribut Pengusaha
    @Override
    public void cetakInfo() {
        System.out.println("== Info Pengusaha ==");
        super.cetakInfo();
        System.out.println("NPWP            : " + npwp);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.printf ("Pajak           : Rp %.2f%n", hitungPajak());
        System.out.println("------------------------------------");
    }
}