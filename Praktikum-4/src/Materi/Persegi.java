/* Nama File : Persegi.java
 * Deskripsi : Program Inheritance Dengan Child Persegi merupakan turunan dari Parent BangunDatar
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 13/03/2025
 */
package Materi;
public final class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;
        this.jmlSisi = 4;
    }

    public double getSisi() {
        return sisi;
    }

    public double setSisi(double sisi) {
        return this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Sisi : " + sisi);

    }

    // Method Ini tidak bisa di Override karena bersifat static
    // @Override
    // public static void printcounterBangunDatar() {
    // System.out.println("Counter Bangun Datar : " + counterBangunDatar);
    // }

}