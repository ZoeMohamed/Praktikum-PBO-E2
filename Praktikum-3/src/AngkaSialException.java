
/* Nama File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendirI,menolak masukkan angka 13
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 06/03/2025
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial");
    }
}
