/* Nama File : Ruang.java
 * Deskripsi : abstract class untuk semua class yang berhubungan dengan ruangan
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

public abstract class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;

    // Konstruktor
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    // Getter methods
    public String getKode() {
        return kode;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    // Menghitung luas ruangan - Method overloading
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    public double hitungLuas(boolean termasukTinggi) {
        if (termasukTinggi) {
            return panjang * lebar * tinggi; // Volume
        } else {
            return panjang * lebar; // Luas biasa
        }
    }

    // Method abstract yang harus diimplementasi di subclass
    public abstract double hitungBiayaKebersihan();
    public abstract void tampilkanInfo(); // Ubah return type menjadi void
}