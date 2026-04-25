// NIM  : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

public class MSeminar {
 
    public static void main(String[] args) {
 
        Dosen d1 = new Dosen("NIP001", "Dr. Andi Wijaya");
        Dosen d2 = new Dosen("NIP002", "Prof. Budi Santoso");
 
        Mahasiswa2 m1 = new Mahasiswa2("NIM001", "Citra Dewi");
        Mahasiswa2 m2 = new Mahasiswa2("NIM002", "Doni Saputra");
        Mahasiswa2 m3 = new Mahasiswa2("NIM003", "Eka Putri");
        Mahasiswa2 m4 = new Mahasiswa2("NIM004", "Farel Hadi");
        Mahasiswa2 m5 = new Mahasiswa2("NIM005", "Gita Maharani");
 
        System.out.println("  ===   REGISTRASI PESERTA SEMINAR  === ");
 
        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);
 
        System.out.println("\n Total peserta seminar : " + seminar.countPeserta() + " orang");
 
        System.out.println();
        seminar.tampilPeserta();
 
        System.out.println(" Jumlah peserta mahasiswa: " + seminar.countMahasiswa() + " orang");
 
        System.out.println("  ===   SET DOSEN WALI MAHASISWA    === ");
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);
        System.out.println("Dosen wali telah ditetapkan.");
 
        System.out.println("  ===   DATA MAHASISWA PESERTA SEMINAR  ===");
        Mahasiswa2[] listMhs = {m1, m2, m3, m4, m5};
        for (Mahasiswa2 m : listMhs) {
            System.out.println("  ----------------------------------------");
            m.tampilDataMahasiswa();
        }
        System.out.println("  ----------------------------------------");
    }
}