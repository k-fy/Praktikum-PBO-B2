/* Nama File    : MainBangunDatar.java
 * Deskripsi    : Program utama untuk menjalankan eksperimen Abstract Class & Interface
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10);
        Persegi     P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran   L2 = new Lingkaran(14); 

        // Menampilkan luas dan keliling tiap objek
        System.out.println("== LUAS DAN KELILING ==");
        System.out.printf("P1 -> Luas: %.2f | Keliling: %.2f%n", P1.getLuas(), P1.getKeliling());
        System.out.printf("P2 -> Luas: %.2f | Keliling: %.2f%n", P2.getLuas(), P2.getKeliling());
        System.out.printf("L1 -> Luas: %.2f | Keliling: %.2f%n", L1.getLuas(), L1.getKeliling());
        System.out.printf("L2 -> Luas: %.2f | Keliling: %.2f%n", L2.getLuas(), L2.getKeliling());

        // Langkah 4 & 5: Perbandingan luas dan keliling antar bangun datar
        System.out.println("\n== PERBANDINGAN LUAS DAN KELILING ==");
        System.out.println("P1.isEqualLuas(P2)       : " + P1.isEqualLuas(P2));
        System.out.println("P1.isEqualLuas(L1)       : " + P1.isEqualLuas(L1));
        System.out.println("P1.isEqualKeliling(L1)   : " + P1.isEqualKeliling(L1));
        System.out.println("L1.isEqualKeliling(L2)   : " + L1.isEqualKeliling(L2));

        // Menampilkan jumlah objek yang telah dibuat
        System.out.println("\n== TOTAL BANGUN DATAR ==");
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterPersegi();
        Lingkaran.printCounterLingkaran();


        // Membuat objek Persegi dan Lingkaran untuk eksperimen IResize
        Persegi   pR = new Persegi(10, "Merah", "Solid");
        Lingkaran lR = new Lingkaran(14, "Biru", "Dotted");

        // Menampilkan informasi sebelum zoom
        System.out.println("\n== INFO SEBELUM ZOOM ==");
        System.out.println("-- PERSEGI --");
        pR.printInfo();
        System.out.println("\n-- LINGKARAN --");
        lR.printInfo();

        // Menampilkan hasil setelah zoomIn
        pR.zoomIn();
        lR.zoomIn();
        System.out.println("\n== SETELAH ZOOMIN (+10%) ==");
        System.out.printf("pR -> sisi=%.2f | Luas=%.2f%n", pR.getSisi(), pR.getLuas());
        System.out.printf("lR -> jari=%.2f | Luas=%.2f%n", lR.getJari(), lR.getLuas());

        // Menampilkan hasil setelah zoomOut
        pR.zoomOut();
        lR.zoomOut();
        System.out.println("\n== SETELAH ZOOMOUT ==");
        System.out.printf("pR -> sisi=%.2f | Luas=%.2f%n", pR.getSisi(), pR.getLuas());
        System.out.printf("lR -> jari=%.2f | Luas=%.2f%n", lR.getJari(), lR.getLuas());

        // Menampilkan hasil setelah zoom dengan persen tertentu
        pR.zoom(200);
        lR.zoom(50);
        System.out.println("\n== SETELAH ZOOM ==");
        System.out.printf("pR -> sisi=%.2f | Luas=%.2f%n", pR.getSisi(), pR.getLuas());
        System.out.printf("lR -> jari=%.2f | Luas=%.2f%n", lR.getJari(), lR.getLuas());

        // Eksperimen menggunakan reference type IResize
        System.out.println("\n== REFERENCE TYPE IResize ==");
        IResize r1 = new Persegi(20, "Hijau", "Solid");
        IResize r2 = new Lingkaran(5, "Kuning", "Dotted");
        r1.zoomIn();
        r2.zoomOut();
        System.out.println("r1 setelah zoomIn -> sisi=" + ((Persegi) r1).getSisi());
        System.out.println("r2 setelah zoomOut -> jari=" + ((Lingkaran) r2).getJari());
    }
}