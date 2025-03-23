/* Nama File : Petani.java
 * Deskripsi : Kelas turunan dari Manusia yang merepresentasikan Petani dan mengimplementasikan interface Pajak
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    // Konstruktor untuk membuat objek Petani dengan data lengkap
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengambil asal kota petani
    public String getAsal_kota() {
        return asal_kota;
    }

    // Mengatur asal kota petani
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Mengambil jumlah objek Petani yang telah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Menghitung masa kerja Petani dengan penambahan konstanta C
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int years = period.getYears();
        int C = 1; // digit nim ke-12

        return years + C;
    }

    // Menghitung pajak Petani (0% - tidak dikenakan pajak)
    @Override
    public double hitungPajak() {
        return 0; // No tax for Petani
    }

    // Menampilkan informasi Petani termasuk asal kota
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}