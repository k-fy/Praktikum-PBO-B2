// NIM  : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

abstract class CivitasAkademika {
    protected String nama;
 
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }
 
    public String getNama() { 
        return nama; 
    }
 
    public abstract String getNomor();
}