/* Nama File : Sewa.java
 * Deskripsi : Main Program untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada kelas Vehicle
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);

        System.out.println();
        Vehicle.hitungSewa(kendaraan);
        Vehicle.hitungSewa(bis);
        Vehicle.hitungSewa(mobil);
    }
}