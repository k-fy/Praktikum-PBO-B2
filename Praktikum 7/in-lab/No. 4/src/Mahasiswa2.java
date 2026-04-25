// NIM   : 24060124140132
// Nama  : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Mahasiswa2 extends CivitasAkademika {
    private String nim;
    private Dosen  dosenWali;
 
    public Mahasiswa2(String nim, String nama) {
        super(nama);
        this.nim      = nim;
        this.dosenWali = null;
    }
 
    public String getNim() { 
        return nim; 
    }
    public Dosen  getDosenWali() {
        return dosenWali; 
    }
 
    @Override
    public String getNomor() {
        return nim; 
    }
 
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }
 
    public void tampilDataMahasiswa() {
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama Mhs     : " + nama);
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "(belum ada)";
        System.out.println("  Dosen Wali   : " + namaWali);
    }
}