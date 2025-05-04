/* Nama File : Burung.java
 * Deskripsi : Kelas Burung yang merupakan turunan dari kelas abstrak Anabul
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 04/05/2025
 */

public class Burung extends Anabul {

    // Constructor dengan parameter nama burung
    public Burung(String Nama) {
        super(Nama);
    }

    // Implementasi method Gerak untuk burung
    @Override
    public void Gerak() {
        System.out.println(super.getNama() + " Bergerak dengan cara terbang.");
    }

    // Implementasi method Bersuara untuk burung
    @Override
    public void Bersuara() {
        System.out.println(super.getNama() + " Mengeluarkan suara Cuitt...");
    }

    // Implementasi method PerilakuKhas untuk burung
    @Override
    public void PerilakuKhas() {
        System.out.println(super.getNama() + " Mematuk biji-bijian.");
    }
}
