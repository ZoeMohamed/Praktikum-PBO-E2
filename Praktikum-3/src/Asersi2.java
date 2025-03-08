/* Nama File : Asersi2.java
 * Deskripsi : Progam untuk menunjukkan asersi
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 06/03/2025
 */

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {

    public static void main(String[] args) {
        double jariJari = 0;

        assert (jariJari > 0) : "Jari jari tidak boleh nol"; // dijalankan ketika asertion false

        Lingkaran l = new Lingkaran(jariJari);

        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling LIngkaran = " + kelilingLingkaran);

    }

}

/*
 * 1. Secara Konsep Apa yang kurang Tepat dari program di atas
 * -- Assertion Bukan untuk Validasi Input
 * Assertion dirancang untuk memeriksa asumsi internal yang
 * diharapkan selalu benar selama pengembangan atau pengujian, bukan untuk
 * memvalidasi input dari pengguna. Dalam kasus ini, jariJari = 0 adalah
 * kemungkinan yang wajar akibat kesalahan input, bukan kesalahan logika
 * program. Oleh karena itu, assertion bukan alat yang tepat untuk menangani
 * situasi ini.
 * 
 * -- Assertion Tidak Mencegah Pembuatan Objek yang Tidak Valid
 * Jika assertion tidak aktif, program akan tetap membuat objek Lingkaran dengan
 * nilai jariJari yang tidak valid (misalnya nol atau negatif). Hal ini
 * melanggar integritas objek, karena lingkaran secara definisi harus memiliki
 * jari-jari positif. Assertion tidak memberikan jaminan bahwa objek hanya
 * dibuat dalam kondisi valid.
 * 
 * -- Assertion tidak dapat menangani kesalahan dengan baik
 * Ketika assertion gagal, program hanya berhenti dengan pesan kesalahan tanpa
 * memberikan kesempatan untuk memperbaiki input atau menangani situasi secara
 * lebih terkontrol.
 * 
 * 
 * Perbaikan Kode yang sesuai dengan konsep dari assertion
 * class Lingkaran {
 * private double jariJari;
 * 
 * public Lingkaran(double jariJari) {
 * // Assertion untuk memastikan jari-jari positif
 * assert jariJari > 0 : "Jari-jari harus lebih besar dari nol";
 * this.jariJari = jariJari;
 * }
 * 
 * public double hitungKeliling() {
 * double keliling = 2 * Math.PI * jariJari;
 * return keliling;
 * }
 * }
 * 
 * public class Asersi2 {
 * public static void main(String[] args) {
 * double jariJari = 0;
 * 
 * // Pengecekan kondisi eksplisit untuk input
 * if (jariJari <= 0) {
 * System.out.println("Error: Jari-jari harus lebih besar dari nol");
 * return; // Menghentikan eksekusi jika input tidak valid
 * }
 * 
 * Lingkaran l = new Lingkaran(jariJari);
 * double kelilingLingkaran = l.hitungKeliling();
 * System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
 * }
 * }
 */