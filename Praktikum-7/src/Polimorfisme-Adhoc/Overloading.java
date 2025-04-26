/* Nama File : Overloading.java
 * Deskripsi : Program untuk mendemonstrasikan konsep overloading pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 24/04/2025
 */
public class Overloading {

    int tambah(int x, int y) {
        return x + y;
    }

    int tambah(int x, int y, int z) {
        return x + y + z;
    }

    double tambah(double x, double y) {
        return x + y;
    }

    double tambah(int y, double x) {
        return x + y;
    }
    public static void main(String[] args) {
        Overloading ol = new Overloading();
        System.out.println(ol.tambah(1, 2));
        System.out.println(ol.tambah(1, 2, 3));
        System.out.println(ol.tambah(1.0, 2.0));
        System.out.println(ol.tambah(2, 1.0));
    }
}