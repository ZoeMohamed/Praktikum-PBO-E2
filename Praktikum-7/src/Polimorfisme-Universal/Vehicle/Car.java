/* Nama File : Car.java
 * Deskripsi : Kelas turunan Car untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Car extends Vehicle {
    @Override
    protected void calRent(int jarak, float harga) {
        float fare = jarak * harga;

        fare = fare - 100.00f;
        System.out.println("Harga Sewa Mbil : " + fare);
    }
}