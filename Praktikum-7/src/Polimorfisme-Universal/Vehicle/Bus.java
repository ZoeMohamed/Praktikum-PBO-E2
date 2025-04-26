/* Nama File : Bus.java
 * Deskripsi : Kelas turunan Bus untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Bus extends Vehicle {
    @Override
    protected void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        System.out.println("Harga Sewa Bus : " + fare);
    }
}