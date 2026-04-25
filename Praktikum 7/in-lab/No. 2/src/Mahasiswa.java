// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

public class Mahasiswa {

    private String nim;
    private String nama;
    private String programStudi;

    public Mahasiswa() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }

    public Mahasiswa(Mahasiswa other) {
        this.nim          = other.nim;
        this.nama         = other.nama;
        this.programStudi = other.programStudi;
    }

    public String getNim()          { 
        return nim; 
    }
    public String getNama()         { 
        return nama; 
    }
    public String getProgramStudi() { 
        return programStudi; 
    }

    public void setNim(String nim) { 
        this.nim  = nim; 
    }
    public void setNama(String nama) {
        this.nama = nama; 
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa other) {
        this.programStudi = other.programStudi;
    }

    public void tampil() {
        System.out.println("  NIM          : " + nim);
        System.out.println("  Nama         : " + nama);
        System.out.println("  Program Studi: " + programStudi);
    }
}