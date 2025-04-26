/* Nama File : Vehicle.java
 * Deskripsi : Kelas dasar Vehicle untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Vehicle {
    protected void calRent(int distance, float price) {
        float fare = price;
        System.out.println("Vehicle price = " + fare);
    }

    public static void hitungSewa(Vehicle v) {
        v.calRent(50, 1000);
    }
}