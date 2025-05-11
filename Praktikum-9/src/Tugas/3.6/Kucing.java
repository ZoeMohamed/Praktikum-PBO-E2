/* Nama File : Kucing.java
 * Deskripsi : Kelas Kucing yang merupakan turunan dari kelas abstrak Anabul
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Kucing extends Anabul {

    // Constructor dengan parameter nama kucing
    public Kucing(String Nama) {
        super(Nama);
    }

    // Implementasi method Gerak untuk kucing
    @Override
    public void Gerak() {
        System.out.println(super.getNama() + " Bergerak dengan cara melata.");
    }

    // Implementasi method Bersuara untuk kucing
    @Override
    public void Bersuara() {
        System.out.println(super.getNama() + " Mengeluarkan suara Meoong...");
    }
}
