/* Nama File : Main.java
 * Deskripsi : Main Program untuk mendemonstrasikan Polimorfisme pada kelas Anabul
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Main {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan Anabul
        Anjing anjing = new Anjing("Maxxy");
        Kucing kucing = new Kucing("Garfield");
        Burung burung = new Burung("Meraki");

        // Memanggil method Gerak dan Bersuara untuk anjing
        anjing.Gerak();
        anjing.Bersuara();

        // Memanggil method Gerak dan Bersuara untuk kucing
        kucing.Gerak();
        kucing.Bersuara();

        // Memanggil method Gerak dan Bersuara untuk burung
        burung.Gerak();
        burung.Bersuara();
    }
}