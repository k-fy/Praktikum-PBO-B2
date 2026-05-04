// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Kelas : B

public class Main {
    public static void main(String[] args) {
        System.out.println("    ==  APLIKASI KELAS GENERIK DATUM  ==");
        Datum<Anabul> datumAnabul = new Datum<>();
        Kucing kucingGarong = new Kucing("Oyen", 3.5);
        datumAnabul.setIsi(kucingGarong);
        System.out.println("Isi Datum Anabul: " + datumAnabul.getIsi().getNama() + " (Kucing)\n");

        System.out.println("    ==  APLIKASI OPERATOR GENERIK   ==");
        OperatorGenerik op = new OperatorGenerik();

        Wrapper<Integer> a = new Wrapper<>(3);
        Wrapper<Integer> b = new Wrapper<>(6);
        System.out.println("Sebelum Tukar Integer: a = " + a.value + ", b = " + b.value);
        op.Tukar(a, b);
        System.out.println("Setelah Tukar Integer: a = " + a.value + ", b = " + b.value);

        Wrapper<String> str1 = new Wrapper<>("Ikan");
        Wrapper<String> str2 = new Wrapper<>("Bebek");
        System.out.println("Sebelum Tukar String: str1 = " + str1.value + ", str2 = " + str2.value);
        op.Tukar(str1, str2);
        System.out.println("Setelah Tukar String: str1 = " + str1.value + ", str2 = " + str2.value);

        Wrapper<Anabul> anjingWrapper = new Wrapper<>(new Anabul("Gukguk"));
        Wrapper<Anabul> kucingWrapper = new Wrapper<>(new Kucing("Meow", 4.0));
        System.out.println("Sebelum Tukar Anabul: a = " + anjingWrapper.value.getNama() + ", b = " + kucingWrapper.value.getNama());
        op.Tukar(anjingWrapper, kucingWrapper);
        System.out.println("Setelah Tukar Anabul: a = " + anjingWrapper.value.getNama() + ", b = " + kucingWrapper.value.getNama());

        Anggora ciko = new Anggora("Black Tea", 4.5);
        Kembangtelon belok = new Kembangtelon("Brownie", 5.2);
        double totalBobot = op.Bobot2(ciko, belok);
        System.out.println("Total bobot 2 keturunan kucing (" + ciko.getNama() + " & " + belok.getNama() + ") : " + totalBobot + " kg\n");

        System.out.println("    ==  APLIKASI LARIK GENERIK ==   ");
        Data<Anabul> dataAnabul = new Data<>();
        
        dataAnabul.setIsi(1, ciko);
        dataAnabul.setIsi(2, belok);
        dataAnabul.setIsi(50, kucingGarong);

        System.out.println("Isi posisi 1: " + dataAnabul.getIsi(1).getNama());
        System.out.println("Isi posisi 2: " + dataAnabul.getIsi(2).getNama());
        System.out.println("Isi posisi 50: " + dataAnabul.getIsi(50).getNama());

        System.out.println("Banyak elemen terisi (Size): " + dataAnabul.getSize());
    }
}