/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jdbc.model;

/**
 * Mahasiswa.java (model)
 * Kelas ini merupakan persistent object yang berperan sebagai model bagi tabel mahasiswa.
 */
public class Mahasiswa {
    // Atribut sesuai dengan tabel mahasiswa
    private int id;
    private String nama;

    // Constructor kosong
    public Mahasiswa() {
    }

    // Constructor dengan parameter id dan nama
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method toString untuk mencetak data objek
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama='" + nama + '\'' + '}';
    }
}
