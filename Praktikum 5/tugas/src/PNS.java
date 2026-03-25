/* Nama File    : PNS.java
 * Deskripsi    : Class PNS yang mewarisi Manusia dan mengimplementasi interface Pajak
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private static final int A = 2;

    // Atribut NIP dan counter PNS
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor tanpa alamat
    public PNS(String nama, LocalDate tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor lengkap dengan alamat
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter untuk NIP
    public String getNip() {
        return nip;
    }

    // Setter untuk NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Getter untuk counter PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Implementasi hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return (int) tahun + A;
    }

    // Implementasi hitungPajak
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Override cetakInfo untuk mencetak seluruh atribut PNS (termasuk dari Manusia)
    @Override
    public void cetakInfo() {
        System.out.println("---------- Info PNS ----------");
        super.cetakInfo();
        System.out.println("NIP             : " + nip);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.printf ("Pajak           : Rp %.2f%n", hitungPajak());
        System.out.println("------------------------------");
    }
}