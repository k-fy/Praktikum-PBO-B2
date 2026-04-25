// NIM    : 24060124140132
// Nama   : Puti Shasta Khafiyani
// Tanggal: 25/04/2026

public class coersion {

    public static void main(String[] args) {

        System.out.println("=== (a) Konversi Tipe Dasar ===");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = nilaiInt;

        System.out.println("Sebagai integer : " + nilaiInt);
        System.out.println("Sebagai karakter: " + nilaiChar);
        System.out.println("Sebagai real    : " + nilaiDouble);

        System.out.println("\n=== (b) Real -> Integer (variabel berbeda) ===");
        double realVal = 65.0;
        int kembaliInt = (int) realVal;
        System.out.println("Nilai real    : " + realVal);
        System.out.println("Kembali ke int: " + kembaliInt);

        System.out.println("\n=== (c) String X, Y -> Konkatenasi S & Penjumlahan Z ===");
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        System.out.println("\n=== (d) String P, Q -> Konkatenasi R & Penjumlahan D ===");
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;                                           // konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);  // penjumlahan

        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        System.out.println("\n=== (e) Integer A dari konversi S ===");
        Integer A = Integer.parseInt(S);
        System.out.println("S = \"" + S + "\"");
        System.out.println("A = " + A);

        System.out.println("\n=== (f) String T dari konversi A ===");
        String T = A.toString();
        System.out.println("A = " + A);
        System.out.println("T = \"" + T + "\"");
    }
}