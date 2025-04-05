/* Nama File : PNS.java
 * Deskripsi : Kelas turunan dari Manusia yang merepresentasikan Pegawai Negeri Sipil dan mengimplementasikan interface Pajak
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor PNS dengan alamat
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor PNS tanpa alamat (alamat kosong)
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Mengambil NIP
    public String getNip() {
        return nip;
    }

    // Mengatur NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mengambil jumlah objek PNS yang telah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Menghitung masa kerja PNS dengan penambahan konstanta A
    @Override
    public int hitungMasaKerja() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(tgl_mulai_kerja, now);
        int years = period.getYears();
        int A = 1; // digit nim ke-14
        return years + A;
    }

    // Menghitung pajak PNS sebesar 10% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan; // 10% of pendapatan
    }

    // Menampilkan informasi PNS termasuk NIP
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}