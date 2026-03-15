/* Nama File    : Dosen.java
 * Deskripsi    : File atribut dan method dalam class Dosen yang merupakan subclass dari Pegawai
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class Dosen extends Pegawai
{
    //  Atribut tambahan untuk dosen
    protected String fakultas;

    // Konstruktor untuk inisialisasi data dosen, memanggil konstruktor superclass Pegawai
    public Dosen(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas)
    {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() { 
        return fakultas;
    }
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }
}
