/* Nama File : Manusia.java
 * Deskripsi : Kelas abstrak yang merepresentasikan Manusia dengan method-method abstrak untuk menghitung masa kerja
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Latihan;
import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor untuk membuat objek Manusia dengan data lengkap
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Mengambil nama manusia
    public String getNama() {
        return nama;
    }

    // Mengatur nama manusia
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengambil tanggal mulai kerja
    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    // Mengatur tanggal mulai kerja
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mengambil alamat
    public String getAlamat() {
        return alamat;
    }

    // Mengatur alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mengambil pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Mengatur pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Mengambil jumlah objek Manusia yang telah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    // Method abstrak untuk menghitung masa kerja dalam tahun
    public abstract int hitungMasaKerja();

    // Menampilkan informasi lengkap manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}