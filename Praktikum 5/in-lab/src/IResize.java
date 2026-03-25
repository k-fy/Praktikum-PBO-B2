/* Nama File    : IResize.java
 * Deskripsi    : Interface yang mendefinisikan kontrak resize sebuah objek
 * Pembuat      : Puti Shasta Khafiyani / 24060124140132
 * Tanggal      : 25/03/2026
 */

public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}