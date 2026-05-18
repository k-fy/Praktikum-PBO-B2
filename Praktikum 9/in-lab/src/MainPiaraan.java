// NIM : 24060124140132
// Nama :  Puti Shasta Khafiyani
// Tanggal : 06/05/2026

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan klinik = new Piaraan();

        Kucing       kc1 = new Kucing("Black Tea", 3.5);
        Kucing       kc2 = new Kucing("Stripes", 4.0);
        Anggora      ag1 = new Anggora("Snowy", 4.5);
        Anggora      ag2 = new Anggora("White Tea", 3.8);
        Kembangtelon kb1 = new Kembangtelon("Brownie", 5.0);
        Kembangtelon kb2 = new Kembangtelon("Darkie", 3.2);

        System.out.println(" == Mengisi Antrean == ");
        klinik.enqueueAnabul(kc1);
        klinik.enqueueAnabul(ag1);
        klinik.enqueueAnabul(kb1);
        klinik.enqueueAnabul(kc2);
        klinik.enqueueAnabul(ag2);
        klinik.enqueueAnabul(kb2);

        klinik.showAnabul();

        System.out.println("\n == getNbelm ==");
        System.out.println("Jumlah hewan: " + klinik.getNbelm());

        System.out.println("\n == isMember == ");
        System.out.println("Snowy ada di antrean? " + klinik.isMember(ag1));
        Anggora ag3 = new Anggora("Asing", 2.0);
        System.out.println("Asing ada di antrean? " + klinik.isMember(ag3));

        System.out.println("\n == getAnabul (peek) == ");
        System.out.println("Pertama di antrean: " + klinik.getAnabul().getNama());
        System.out.println("Jumlah tetap: " + klinik.getNbelm());

        System.out.println("\n == dequeueAnabul == ");
        Anabul dilayani = klinik.dequeueAnabul();
        System.out.println("Sedang dilayani: " + dilayani.getNama());
        System.out.println("Sisa antrean: " + klinik.getNbelm());

        System.out.println("\n == countKucing ==");
        System.out.println("Jumlah keluarga kucing: " + klinik.countKucing());

        System.out.println("\n == bobotKucing == ");
        System.out.printf("Total bobot kucing: %.1f kg%n", klinik.bobotKucing());

        System.out.println();
        klinik.showJenisAnabul();
    }
}