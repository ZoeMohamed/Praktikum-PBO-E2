/**
 * Nama File : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 01/05/2025
 */

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double hitungKeliling() {
        return alas + sisiB + sisiC;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}