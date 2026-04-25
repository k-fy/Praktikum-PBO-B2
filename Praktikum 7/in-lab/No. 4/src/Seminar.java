// NIM  : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

class Seminar {
    private static final int MAKS = 100;
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;
 
    public Seminar() {
        pesertas      = new CivitasAkademika[MAKS];
        banyakPeserta = 0;
    }
 
    public int countPeserta() {
        return banyakPeserta;
    }
 
    public void registrasi(CivitasAkademika ca) {
        if (banyakPeserta >= MAKS) {
            System.out.println("Kapasitas penuh! " + ca.getNama() + " tidak dapat didaftarkan.");
            return;
        }
        pesertas[banyakPeserta] = ca;
        banyakPeserta++;
        System.out.println("Registrasi berhasil: " + ca.getNama() + " [" + ca.getNomor() + "]");
    }
 
    public void tampilPeserta() {
        System.out.println("--------------------------------------------");
        System.out.println("  Daftar Peserta Seminar (" + banyakPeserta + " orang)");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.printf("  %2d. %-15s  Nomor: %s%n",
                    i + 1, pesertas[i].getNama(), pesertas[i].getNomor());
        }
        System.out.println("--------------------------------------------");
    }
 
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}