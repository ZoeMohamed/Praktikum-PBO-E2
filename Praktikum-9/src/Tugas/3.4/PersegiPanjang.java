/**
 * Nama File : PersegiPanjang.java
 * Deskripsi : implementasi PersegiPanjang sebagai BangunDatar
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 01/05/2025
 */

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}