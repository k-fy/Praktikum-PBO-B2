// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

public class MMahasiswa {
        public static void main(String[] args) {

        System.out.println("=== (b) Aplikasi Overloading setProgramStudi ===\n");

        Mahasiswa m1 = new Mahasiswa("24060124120038", "Alyssa Shane", "Informatika");
        System.out.println("Mahasiswa m1 awal:");
        m1.tampil();

        m1.setProgramStudi();
        System.out.println("\nSetelah setProgramStudi() [tanpa param]:");
        m1.tampil();

        m1.setProgramStudi("Kedokteran");
        System.out.println("\nSetelah setProgramStudi(\"Kedokteran\"):");
        m1.tampil();

        Mahasiswa m2 = new Mahasiswa("24060124130101", "Galang Bintang Ramadhan", "Teknik Mesin");
        System.out.println("\nMahasiswa m2 :");
        m2.tampil();

        m1.setProgramStudi(m2);
        System.out.println("\nSetelah setProgramStudi(m2) pada m1:");
        m1.tampil();

        System.out.println("\n=== (c) Konstruktor Default ===");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampil();

        System.out.println("\n=== (d) Konstruktor Tiga Parameter ===");
        Mahasiswa mParam = new Mahasiswa("24060124140155", "Revalina Salwa", "Matematika");
        mParam.tampil();

        System.out.println("\n=== (e) Konstruktor Kloning ===");
        Mahasiswa mKlon = new Mahasiswa(mParam);
        System.out.println("Objek asli (mParam):");
        mParam.tampil();
        System.out.println("Hasil kloning (mKlon):");
        mKlon.tampil();

        mKlon.setNama("Olivia Oktaviani");
        System.out.println("\nSetelah mengubah nama mKlon:");
        System.out.println("mParam.nama = " + mParam.getNama());
        System.out.println("mKlon.nama  = " + mKlon.getNama());
    }
}