/* Nama File    : MBangunDatar.java
 * Deskripsi    : Program utama bangun datar
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi dan Lingkaran dengan parameter yang sesuai
        Persegi p = new Persegi(20, "Merah", "Solid");
        Lingkaran l = new Lingkaran(15, "Biru", "Dotted");
        
        // Menampilkan informasi tentang Persegi dan Lingkaran
        System.out.println("== INFORMASI PERSEGI ==");
        p.printInfo();
        
        // Menampilkan informasi tentang Lingkaran
        System.out.println("\n== INFO LINGKARAN ==");
        l.printInfo();

        // Menampilkan total jumlah objek BangunDatar yang telah dibuat
        System.out.println("\n== TOTAL BANGUN DATAR ==");
        BangunDatar.printCounterBangunDatar();
    }
}