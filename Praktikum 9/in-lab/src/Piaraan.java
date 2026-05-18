// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Tanggal : 06/05/26

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        if (Lanabul.isEmpty()) {
            System.out.println("Antrean kosong!");
            return null;
        }
        nbelm--;
        return Lanabul.poll();
    }

    public void showAnabul() {
        System.out.println(" == Antrean Klinik Hewan (" + nbelm + " hewan) == ");
        if (nbelm == 0) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int no = 1;
        for (Anabul a : Lanabul) {
            System.out.println(no++ + ". " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) count++;
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a: Lanabul){
            if (a instanceof Kucing) total += a.getBobot();
        }
        return total;
    }

    public void showJenisAnabul() {
        System.out.println(" == Daftar Anabul Beserta Jenis (" + nbelm + " hewan) == ");
        if (nbelm == 0) {
            System.out.println("(Antrean kosong)");
            return;
        }
        int no = 1;
        for (Anabul a : Lanabul) {
            String namaKelas = a.getClass().getSimpleName();
            System.out.println(no++ + ". " + a.getNama() + " - " + namaKelas);
        }
    }
}