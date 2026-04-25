// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

abstract class Anabul {
    protected String nama;
 
    public Anabul(String nama) {
        this.nama = nama;
    }
 
    public String getNama() { 
        return nama; 
    }
 
    public abstract void gerak();
    public abstract void bersuara();
}