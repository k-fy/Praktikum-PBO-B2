/* Nama File    : Petani.java
 * Deskripsi    : Class Petani yang mewarisi Manusia dan mengimplementasi interface Pajak
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private static final int C = 1;

    // Atribut asal kota dan counter Petani
    private String asalKota;
    private static int counterPetani = 0;

    // Konstruktor tanpa alamat
    public Petani(String nama, LocalDate tglMulaiKerja, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // Konstruktor lengkap dengan alamat
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // Getter untuk asal kota
    public String getAsalKota() {
        return asalKota;
    }

    // Setter untuk asal kota
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }

    // Getter untuk counter Petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Implementasi hitungMasaKerja
    @Override
    public int hitungMasaKerja() {
        long tahun = ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
        return (int) tahun + C;
    }

    // Implementasi hitungPajak: Petani tidak dikenakan pajak
    @Override
    public double hitungPajak() {
        return 0;
    }

    // Override cetakInfo untuk mencetak seluruh atribut Petani
    @Override
    public void cetakInfo() {
        System.out.println("== Info Petani ==");
        super.cetakInfo();
        System.out.println("Asal Kota       : " + asalKota);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.printf ("Pajak           : Rp %.2f%n", hitungPajak());
        System.out.println("---------------------------------");
    }
}