/* Nama File    : MPT.java
 * Deskripsi    : Program utama untuk menguji kelas Pegawai, DosenTetap, DosenTamu, dan Tendik
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 11/03/2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MPT
{
    public static void main(String[] args)
    {
        // Tanggal simulasi: 10 Maret 2025
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate tglSimulasi = LocalDate.parse("10 Maret 2025", fmt);

        // Contoh Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548",
            "78647324",
            "Andi",
            "5 Mei 1990",
            "1 Januari 2015",
            5_000_000,
            "Fakultas Sains dan Matematika"
        );

        System.out.println("== INFORMASI DOSEN TETAP ==");
        dosenTetap.printInfo(tglSimulasi);

        System.out.println();

        // Contoh Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
            "8812345678",
            "KH12345678",
            "Budi Santoso",
            "15 Maret 1985",
            "1 Juni 2022",
            4_000_000,
            "Fakultas Teknik",
            "31 Desember 2026"
        );

        System.out.println("== INFORMASI DOSEN TAMU ==");
        dosenTamu.printInfo(tglSimulasi);

        System.out.println();

        // Contoh Tenaga Kependidikan
        Tendik tendik = new Tendik(
            "7723456789",
            "Sari Dewi",
            "20 Agustus 1992",
            "1 Maret 2018",
            3_500_000,
            "Akademik"
        );

        System.out.println("== INFORMASI TENDIK ==");
        tendik.printInfo(tglSimulasi);
    }
}
