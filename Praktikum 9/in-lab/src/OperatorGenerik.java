// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Kelas : B

public class OperatorGenerik {

    // Menggunakan Wrapper agar nilai asli bisa ditukar (karena Java pass-by-value)
    public <T> void Tukar(Wrapper<T> a, Wrapper<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // Fungsi generik Bobot2 untuk keturunan kucing
    // T1 dan T2 bisa saja tipe kucing yang berbeda (misal Anggora dan Kembangtelon)
    public <T1 extends Kucing, T2 extends Kucing> double Bobot2(T1 k1, T2 k2) {
        return k1.getBobot() + k2.getBobot();
    }
}