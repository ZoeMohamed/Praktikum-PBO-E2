/* Nama File : IResize.java
 * Deskripsi : Interface yang mendefinisikan kemampuan untuk mengubah ukuran suatu objek
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Materi;
public interface IResize {
    // Method untuk memperbesar ukuran objek sebesar 10%
    public void zoomIn();

    // Method untuk memperkecil ukuran objek sebesar 10%
    public void zoomOut();

    // Method untuk mengubah ukuran objek sesuai persentase yang diberikan
    public void zoom(int percent);
}