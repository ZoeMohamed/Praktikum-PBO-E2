/* Nama File : Persegi.java
 * Deskripsi : Kelas turunan dari BangunDatar yang merepresentasikan bentuk Persegi dan mengimplementasikan IResize
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */

 
package Materi;
public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    // Konstruktor default
    public Persegi() {
        setJmlSisi(4);
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;
        this.jmlSisi = 4;
    }

    // Mengambil nilai sisi
    public double getSisi() {
        return sisi;
    }

    // Mengatur nilai sisi
    public double setSisi(double sisi) {
        return this.sisi = sisi;
    }

    // Menghitung luas persegi
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung keliling persegi
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menghitung panjang diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Menampilkan informasi persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
    }

    // Memperbesar ukuran persegi sebesar 10%
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    // Memperkecil ukuran persegi sebesar 10%
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    // Mengubah ukuran persegi sesuai persentase yang diberikan
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }

    // Method Ini tidak bisa di Override karena bersifat static
    // @Override
    // public static void printcounterBangunDatar() {
    // System.out.println("Counter Bangun Datar : " + counterBangunDatar);
    // }
}