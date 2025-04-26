/* Nama File : Anjing.java
 * Deskripsi : Kelas Anjing yang merupakan turunan dari kelas abstrak Anabul
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Anjing extends Anabul {

    // Constructor dengan parameter nama anjing
    public Anjing(String Nama) {
        super(Nama);
    }

    // Implementasi method Gerak untuk anjing
    @Override
    public void Gerak() {
        System.out.println(super.getNama() + " Bergerak dengan cara melata.");
    }

    // Implementasi method Bersuara untuk anjing
    @Override
    public void Bersuara() {
        System.out.println(super.getNama() + " Mengeluarkan suara Guk-guk...");
    }
}
