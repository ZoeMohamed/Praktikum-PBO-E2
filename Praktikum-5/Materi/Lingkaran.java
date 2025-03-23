/* Nama File : Lingkaran.java
 * Deskripsi : Kelas turunan dari BangunDatar yang merepresentasikan bentuk Lingkaran dan mengimplementasikan IResize
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */

package Materi;
public class Lingkaran extends BangunDatar implements IResize {

    private double jari;

    // Konstruktor default
    public Lingkaran() {
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String border, String warna) {
        super(1, warna, border);
        this.jari = diameter / 2;
    }

    // Mengambil nilai jari-jari
    public double getJari() {
        return jari;
    }

    // Mengatur nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menghitung luas lingkaran
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Menghitung keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Menampilkan informasi lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + jari);
    }

    // Memperbesar ukuran lingkaran sebesar 10%
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    // Memperkecil ukuran lingkaran sebesar 10%
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    // Mengubah ukuran lingkaran sesuai persentase yang diberikan
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }
}
