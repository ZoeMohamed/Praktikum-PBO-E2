/* Nama File : Pengusaha.java
 * Deskripsi : Kelas turunan dari Manusia yang merepresentasikan Pengusaha dan mengimplementasikan interface Pajak
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstruktor untuk membuat objek Pengusaha dengan data lengkap
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengambil NPWP pengusaha
    public String getNpwp() {
        return npwp;
    }

    // Mengatur NPWP pengusaha
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Mengambil jumlah objek Pengusaha yang telah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Menghitung masa kerja Pengusaha dengan penambahan konstanta B
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int years = period.getYears();
        int B = 8; // digit nim ke-13
        return years + B;
    }

    // Menghitung pajak Pengusaha sebesar 15% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan; // 15% of pendapatan
    }

    // Menampilkan informasi Pengusaha termasuk NPWP
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}