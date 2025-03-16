/* Nama File : Lingkaran.java
 * Deskripsi : Program Inheritance Dengan Child Lingkaran merupakan turunan dari Parent BangunDatar
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 13/03/2025
 */
package Materi;

public class Lingkaran extends BangunDatar {

    private double jari;

    public Lingkaran() {
    }

    public Lingkaran(double diameter, String border, String warna) {

        super(1, warna, border);
        this.jari = diameter / 2;

    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Penerapan Methode Overriding
    @Override
    public void printInfo() {

        super.printInfo();

        System.out.println("Jari-jari : " + jari);
    }

}
