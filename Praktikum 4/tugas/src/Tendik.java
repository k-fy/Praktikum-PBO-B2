/* Nama File    : Tendik.java
 * Deskripsi    : File atribut dan method dalam class Tendik yang merupakan subclass dari Pegawai
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai
{
    // Atribut tambahan untuk tenaga kependidikan
    private String bidang; // Akademik, Kemahasiswaan, atau Sumber Daya
    private static final int BUP = 55;

    //  Konstruktor untuk inisialisasi data tenaga kependidikan, memanggil konstruktor superclass Pegawai
    public Tendik(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String bidang)
    {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Tunjangan = 1% x masa kerja (tahun) x gaji pokok
    public double getTunjangan(LocalDate tglSimulasi)
    {
        int tahunKerja = getMasaKerja(tglSimulasi).getYears();
        return 0.01 * tahunKerja * gajiPokok;
    }

    // Override method printInfo untuk menampilkan informasi lengkap tenaga kependidikan
    @Override
    public void printInfo(LocalDate tglSimulasi)
    {
        Period masaKerja = getMasaKerja(tglSimulasi);
        int tahunKerja = masaKerja.getYears();
        double tunjangan = getTunjangan(tglSimulasi);

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + tahunKerja + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getTglPensiun(BUP).format(fmt));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 1% x " + tahunKerja + " x Rp " + String.format("%,.2f", gajiPokok)
                + " = Rp " + String.format("%,.2f", tunjangan));
    }

    // Getter dan setter untuk bidang
    public String getBidang() { 
        return bidang; 
    }

    // Setter untuk bidang
    public void setBidang(String bidang) { 
        this.bidang = bidang; 
    }
}