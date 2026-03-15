/* Nama File    : DosenTetap.java
 * Deskripsi    : File atribut dan method dalam class DosenTetap yang merupakan subclass dari Dosen
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen
{
    // Atribut tambahan untuk dosen tetap
    private String nidn;
    private static final int BUP = 65;

    // Konstruktor untuk inisialisasi data dosen tetap, memanggil konstruktor superclass Dosen
    public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas)
    {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // Tunjangan = 2% x masa kerja (tahun) x gaji pokok
    public double getTunjangan(LocalDate tglSimulasi)
    {
        int tahunKerja = getMasaKerja(tglSimulasi).getYears();
        return 0.02 * tahunKerja * gajiPokok;
    }

    // Override method printInfo untuk menampilkan informasi lengkap dosen tetap
    @Override
    public void printInfo(LocalDate tglSimulasi)
    {
        Period masaKerja = getMasaKerja(tglSimulasi);
        int tahunKerja = masaKerja.getYears();
        double tunjangan = getTunjangan(tglSimulasi);

        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + tahunKerja + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getTglPensiun(BUP).format(fmt));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2% x " + tahunKerja + " x Rp " + String.format("%,.2f", gajiPokok)
                + " = Rp " + String.format("%,.2f", tunjangan));
    }

    // Getter dan setter untuk nidn
    public String getNidn() { 
        return nidn; 
    }
    
    // Setter untuk nidn
    public void setNidn(String nidn) { 
        this.nidn = nidn; 
    }
}
