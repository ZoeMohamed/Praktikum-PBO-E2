/* Nama File : Anabul.java
 * Deskripsi : Kelas abstrak Anabul yang akan diimplementasikan oleh kelas turunannya
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public abstract class Anabul {
    private String Nama;

    // Constructor dengan parameter nama
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Method abstrak untuk definisi pergerakan anabul
    public abstract void Gerak();

    // Method abstrak untuk definisi suara anabul
    public abstract void Bersuara();

    // Getter untuk mendapatkan nama anabul
    public String getNama() {
        return Nama;
    }
}
