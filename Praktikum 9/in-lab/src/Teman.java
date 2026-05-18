// NIM : 24060124140132
// Nama : Puti Shasta Khafiyani
// Kelas : B

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } 
        else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
            System.out.println("Nama \"" + nama + "\" berhasil dihapus.");
        } 
        else {
            System.out.println("Nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        boolean ditemukan = false;
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
                ditemukan = true;
            }
        }
        if (ditemukan) {
            System.out.println("Nama \"" + nama + "\" berhasil diganti menjadi \"" + namabaru + "\".");
        } 
        else {
            System.out.println("Nama \"" + nama + "\" tidak ditemukan.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("=== Daftar Teman (" + nbelm + " orang) ===");
        if (nbelm == 0) {
            System.out.println("(Belum ada teman)");
        } 
        else {
            for (int i = 0; i < Lnama.size(); i++) {
                System.out.println((i + 1) + ". " + Lnama.get(i));
            }
        }
    }
}