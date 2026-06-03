import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan
 * key (NIM) dan value (Nama Mahasiswa).
 */
public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2026001", "Adi");
        mahasiswaMap.put("2026002", "Bambang");
        mahasiswaMap.put("2026003", "Cici");
        mahasiswaMap.put("2026004", "Didi");

        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}