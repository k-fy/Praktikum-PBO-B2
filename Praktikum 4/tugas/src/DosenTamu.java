/* Nama File    : DosenTamu.java
 * Deskripsi    : File atribut dan method dalam class DosenTamu yang merupakan subclass dari Dosen
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen
{
    // Atribut tambahan untuk dosen tamu
    private String nidk;
    private LocalDate tglBerakhirKontrak;

   //  Konstruktor untuk inisialisasi data dosen tamu, memanggil konstruktor superclass Dosen
    public DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglBerakhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhirKontrak, fmt);
    }

    // Tunjangan = 2.5% x gaji pokok
    public double getTunjangan(){
        return 0.025 * gajiPokok;
    }

    // Sisa kontrak = bulan dari tglSimulasi ke tglBerakhirKontrak
    public int getSisaKontrakBulan(LocalDate tglSimulasi) {
        Period sisa = Period.between(tglSimulasi, tglBerakhirKontrak);
        return sisa.getYears() * 12 + sisa.getMonths();
    }

    // Override method printInfo untuk menampilkan informasi lengkap dosen tamu
    @Override
    public void printInfo(LocalDate tglSimulasi) {
        Period masaKerja = getMasaKerja(tglSimulasi);
        double tunjangan = getTunjangan();

        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Berakhir Kontrak: " + tglBerakhirKontrak.format(fmt)
                + " (sisa " + getSisaKontrakBulan(tglSimulasi) + " bulan)");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2.5% x Rp " + String.format("%,.2f", gajiPokok)
                + " = Rp " + String.format("%,.2f", tunjangan));
    }

    // Getter dan setter untuk nidk dan tglBerakhirKontrak
    public String getNidk() { 
        return nidk; 
    }

    // Setter untuk nidk
    public void setNidk(String nidk) { 
        this.nidk = nidk; 
    }
    
    // Getter dan setter untuk tglBerakhirKontrak
    public LocalDate getTglBerakhirKontrak() { 
        return tglBerakhirKontrak; 
    }

    //  Setter untuk tglBerakhirKontrak
    public void setTglBerakhirKontrak(LocalDate tglBerakhirKontrak) { 
        this.tglBerakhirKontrak = tglBerakhirKontrak; 
    }
}
