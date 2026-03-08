package MMahasiswa.src;
public class Mahasiswa {

    private String nim;
    private String nama;
    private String prodi;

    private MataKuliah[] listMatKul = new MataKuliah[50];
    private int jumlahMatKul = 0;

    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim() { 
        return nim; 
    }
    public String getNama() {
         return nama; 
    }
    public String getProdi() {
        return prodi; 
    }

    public void setNim(String nim) { this.nim = nim; }
    public void setNama(String nama) { this.nama = nama; }
    public void setProdi(String prodi) { this.prodi = prodi; }

    public void setDosenWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = mk;
            jumlahMatKul++;
        }
    }

    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public int getJumlahSKS() {
        int total = 0;

        for (int i = 0; i < jumlahMatKul; i++) {
            total += listMatKul[i].getSks();
        }

        return total;
    }

    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs() {

        printMhs();

        System.out.println("\nDosen Wali:");
        System.out.println(dosenWali.getNama());

        System.out.println("\nMata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }

        if (kendaraan != null) {
            System.out.println("\nKendaraan:");
            System.out.println(kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
        }
    }
}