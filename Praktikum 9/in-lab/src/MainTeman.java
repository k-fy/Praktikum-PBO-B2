// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal : 06/05/2026

public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        System.out.println(" == Menambahkan Teman == ");
        t.addNama("Syifa");
        t.addNama("Alyssa");
        t.addNama("Nailah");
        t.addNama("Karina");
        t.addNama("Sela");

        t.showTeman();

        System.out.println("\n == getNbelm == ");
        System.out.println("Jumlah teman: " + t.getNbelm());

        System.out.println("\n == getNama(indeks) == ");
        System.out.println("Nama pada indeks 1: " + t.getNama(1));
        System.out.println("Nama pada indeks 3: " + t.getNama(3));

        System.out.println("\n == setNama(indeks, nama) == ");
        t.setNama(2, "Syifa");
        System.out.println("Nama indeks 2 setelah diubah: " + t.getNama(2));

        System.out.println("\n == isMember == ");
        System.out.println("Apakah 'Syifa' anggota? " + t.isMember("Syifa"));
        System.out.println("Apakah 'Karina' anggota? " + t.isMember("Karina"));

        System.out.println("\n == countNama ==");
        System.out.println("Jumlah 'Syifa' dalam list: " + t.countNama("Syifa"));

        System.out.println("\n == gantiNama == ");
        t.gantiNama("Karina", "Julia");
        t.showTeman();

        System.out.println("\n == delNama == ");
        t.delNama("Sela");
        t.delNama("Nailah");
        t.showTeman();
    }
}

