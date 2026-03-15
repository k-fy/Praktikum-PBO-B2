/* Nama File    : Pegawai.java
 * Deskripsi    : File atribut dan method dalam class Pegawai
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai
{

    // Atribut dasar pegawai
    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    // Konstruktor untuk inisialisasi data pegawai
    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gajiPokok)
    {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, fmt);
        this.tmt = LocalDate.parse(tmt, fmt);
        this.gajiPokok = gajiPokok;
    }

    // Menghitung masa kerja dari TMT hingga tanggal simulasi
    public Period getMasaKerja(LocalDate tglSimulasi)
    {
        return Period.between(tmt, tglSimulasi);
    }

    // Menghitung tanggal pensiun: tanggal 1 bulan berikutnya setelah ulang tahun ke-BUP
    public LocalDate getTglPensiun(int bup)
    {
        return tglLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    // Mencetak informasi dasar pegawai
    public void printInfo(LocalDate tglSimulasi)
    {
        Period masaKerja = getMasaKerja(tglSimulasi);
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }

    // Getter dan setter untuk atribut dasar pegawai
    public String getNip() {
        return nip; 
    }

    // Setter untuk nip
    public void setNip(String nip) { 
        this.nip = nip;
    }

    // Getter dan setter untuk nama, tglLahir, tmt, dan gajiPokok
    public String getNama() {
         return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    // Getter dan setter untuk tglLahir dan tmt
    public LocalDate getTglLahir() {    
        return tglLahir;
    }

    // Setter untuk tglLahir
    public void setTglLahir(LocalDate tglLahir) {   
        this.tglLahir = tglLahir;
    }

    // Getter dan setter untuk tmt dan gajiPokok
    public LocalDate getTmt() { 
        return tmt;
    }

    // Setter untuk tmt
    public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    // Getter dan setter untuk gajiPokok
    public double getGajiPokok() { 
        return gajiPokok; 
    }

    // Setter untuk gajiPokok
    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
}