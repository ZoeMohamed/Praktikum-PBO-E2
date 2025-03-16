/* Nama File : MBangunDatar.java
 * Deskripsi : Program Main Untuk Menguji Inheritance Dengan Parent BangunDater dan Child Persegi dan Lingkaran
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 13/03/2025
 */
package Materi;

public class MBangunDatar {
    public static void main(String[] args) {

        // Membuat Objek bangun datar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Merah");
        bd.setBorder("Hitam");
        System.out.println("Info BangunDatar");
        bd.printInfo();
        System.out.println("");

        // Membuat Objek Persegi
        Persegi p = new Persegi(5, "Hijau", "Kuning");
        System.out.println("Info Persegi");
        p.printInfo();
        System.out.println("");

        // Membuat Objek Lingkaran
        Lingkaran l = new Lingkaran(5, "Hijau", "Kuning");
        System.out.println("Info Lingkaran");

        l.printInfo();
    }

}
